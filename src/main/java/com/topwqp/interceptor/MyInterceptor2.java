package com.topwqp.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by Administrator on 2016/10/30 0030.
 */
public class MyInterceptor2 implements Interceptor {

    @Override
    public void destroy() {
        System.out.println("MyInterceptor2-destroy2.....");
    }

    @Override
    public void init() {
        System.out.println("MyInterceptor2-init2.....");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("MyInterceptor2-intercept()-start");
        String result =  invocation.invoke();
        System.out.println("MyInterceptor2-intercept()-end");
        return result;
    }
}
