package com.jwang261.proxy.cjlibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jwang261
 * @date 2021/2/4 6:24 PM
 */
public class TeacherProxyFactory implements MethodInterceptor {
    private Object realTarget;

    public TeacherProxyFactory(Object realTarget) {
        this.realTarget = realTarget;
    }
    //返回一个代理对象
    public Object getProxyInstance(){
        //1、创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2、设置父类
        enhancer.setSuperclass(realTarget.getClass());
        //3、设置回调函数
        enhancer.setCallback(this);
        //4、创建代理对象 - 子类
        return enhancer.create();
    }


    @Override
    public Object intercept(Object arg0, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Start Cglib Proxy");
        Object returnVal = method.invoke(realTarget, args);
        System.out.println("End Cglib Proxy");
        return returnVal;
    }
}
