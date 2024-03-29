package com.github.hcsp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

// proxy为了实现动态代理需要实现InvocationHandler 接口
public class LogProxy implements InvocationHandler {
    DataService delegate;

    public LogProxy(DataService delegate){
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " is invoked:  " + Arrays.toString(args));
        Object retValue = method.invoke(delegate, args);
        System.out.println(method.getName() + " is finished: " + retValue);
        return retValue;
    }
}
