package com.gupao.demo.controller;

import com.gupao.mvcframework.annotation.MyController;
import com.gupao.mvcframework.annotation.MyRequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Spencer Zhang
 * @ClassName DemoController
 * @Description 手写mvc用例
 * @Date 2019/04/10
 */
@MyController
@MyRequestMapping("/demo")
public class DemoController {

    @MyRequestMapping("/query")
    public void query(HttpServletResponse resp, String name) {
        try {
            resp.getWriter().write("Queried by "+name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
