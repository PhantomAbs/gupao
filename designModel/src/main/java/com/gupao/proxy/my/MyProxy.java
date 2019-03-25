package com.gupao.proxy.my;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Spencer Zhang
 * @ClassName MyProxy
 * @Description 重写JDK代理
 * @Date 2019/03/25
 */
public class MyProxy {

    private static int i = 0;
    private static final String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h) {
        String detail = generateClass(interfaces);
        String path = MyProxy.class.getResource("").getPath();
        //"E:\\123\\";
        File f = new File(path + "$Proxy" + i + ".java");
        try (FileWriter fw = new FileWriter(f)) {
            fw.write(detail);
            fw.flush();

            //.java编译为.class
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            try (StandardJavaFileManager manager =
                         compiler.getStandardFileManager(null, null, null)) {
                compiler.getTask(
                        null,
                        manager,
                        null,
                        null,
                        null,
                        manager.getJavaFileObjects(f)).call();
            }

            //f.getName();
            Class clz = loader.getClass("$Proxy0");
            Constructor c = clz.getConstructor(InvocationHandler.class);
            return c.newInstance(h);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            //f.delete();
        }
        return null;
    }

    /**
     * @param interfaces 偷懒，只实现第一个接口的
     * @return
     */
    private static String generateClass(Class<?>[] interfaces) {
        String interfaceName = interfaces[0].getName();
        StringBuilder sb = new StringBuilder();
        sb.append("package com.gupao.proxy.my;" + ln +
                "" + ln +
                "import com.gupao.proxy.Base;" + ln +
                "" + ln +
                "import java.lang.reflect.InvocationHandler;" + ln +
                "import java.lang.reflect.Proxy;" + ln);
        sb.append(ln);
        sb.append("/**" + ln +
                " * @author Spencer Zhang" + ln +
                " * @ClassName $Proxy" + ln +
                " * @Description 模拟自动生成" + ln +
                " * @Date 2019/03/25" + ln +
                " */");
        sb.append(ln);
        sb.append("public class $Proxy" + i + " extends Proxy implements " + interfaceName + " {" + ln);
        sb.append(ln);
        sb.append("    public $Proxy" + i + "(InvocationHandler h) {" + ln +
                "        super(h);" + ln +
                "    }" + ln);
        sb.append("" + ln);
        sb.append("    @Override" + ln +
                "    public void dosomething() {" + ln +
                "        try {" + ln +
                "            h.invoke(" + ln +
                "                    this," + ln +
                "                    Class.forName(\"" + interfaceName + "\").getMethod(\"dosomething\", new Class[]{})," + ln +
                "                    null" + ln +
                "                    );" + ln +
                "        } catch (ClassNotFoundException e) {" + ln +
                "            e.printStackTrace();" + ln +
                "        } catch (NoSuchMethodException e) {" + ln +
                "            e.printStackTrace();" + ln +
                "        } catch (Throwable throwable) {" + ln +
                "            throwable.printStackTrace();" + ln +
                "        }" + ln +
                "    }" + ln +
                "}");
        return sb.toString();
    }
}
