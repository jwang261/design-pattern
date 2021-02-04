package com.jwang261.proxy.dynamicProxy;

/**
 * @author jwang261
 * @date 2021/2/4 5:56 PM
 */

/**
 * 代理对象不需要实现借口，但真实对象要实现借口
 * 代理对象工厂根据传入的真实对象反射生成代理对象，通过代理对象调用目标方法
 */
public class Client {
    public static void main(String[] args) {
        TeacherProxyFactory teacherProxyFactory = new TeacherProxyFactory(new TeacherDao());
        ITeacherDao teacherProxy = (ITeacherDao) teacherProxyFactory.getProxyInstance();
        teacherProxy.teach();
    }
}
