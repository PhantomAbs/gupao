package com.gupao.mvcframework.core;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Spencer Zhang
 * @ClassName MyDispatcherServlet
 * {@link org.springframework.web.servlet.DispatcherServlet}
 * @Date 2019/04/10
 */
public class MyDispatcherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        //获取配置文件

        Properties properties = new Properties();
        try(InputStream is = this.getClass().getClassLoader().getResourceAsStream("myApplication.properties");) {
            properties.load(is);
            //需扫包的路径
            String path = properties.getProperty("scanPackage");
            //递归获取全.class文件
            //初始化
            //对应属性注入

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
