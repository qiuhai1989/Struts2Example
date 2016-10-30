package com.topwqp.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by Administrator on 2016/10/30 0030.
 */
public class MyInterceptor1 implements Interceptor {

    @Override
    public void destroy() {
        System.out.println("MyInterceptor1-destroy1.....");
    }

    @Override
    public void init() {
        System.out.println("MyInterceptor1-init1.....");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("MyInterceptor1-intercept()-start");
        String result =  invocation.invoke();
        System.out.println("MyInterceptor1-intercept()-end");
        return result;
    }
}
