package com.gupao.template_adapter;

/**
 * @author Spencer Zhang
 * @ClassName LoginAdapter
 * @Description 登录接口适配
 * @Date 2019/03/27
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    void login(String id, Object adapter);
}
