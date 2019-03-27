package com.gupao.template_adapter;

/**
 * @author Spencer Zhang
 * @ClassName LoginAdapter4QQ
 * @Date 2019/03/27
 */
public class LoginAdapter4QQ implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginAdapter4QQ;
    }

    @Override
    public void login(String id, Object adapter) {
        System.out.println("使用QQ登录");
    }
}
