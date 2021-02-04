package com.jwang261.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author jwang261
 * @date 2021/2/4 5:58 PM
 */
public class TeacherProxyFactory {

    private Object realTarget;


    public TeacherProxyFactory(Object realTarget) {
        this.realTarget = realTarget;
    }
    public Object getProxyInstance(){
        //InvocationHandler：会把当前执行的目标对象方法作为参数传入
        return Proxy.newProxyInstance(realTarget.getClass().getClassLoader(),
                realTarget.getClass().getInterfaces(),

                //如何调用目标对象方法
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Start JDK Proxy");
                        Object returnVal = method.invoke(realTarget, args);
                        System.out.println("End JDK Proxy");
                        return returnVal;
                    }
                });
    }
}

