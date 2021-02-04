package com.jwang261.proxy.cjlibProxy;

/**
 * @author jwang261
 * @date 2021/2/4 6:18 PM
 */

/**
 * 静态代理和JDK代理都要求真实对象实现一个接口
 * 如果真实对象仅仅为单独对象，那这时候可以使用真实对象的子类来实现代理 - SpringAOP方法拦截
 */
public class Client {
    public static void main(String[] args) {
        TeacherProxyFactory teacherProxyFactory = new TeacherProxyFactory(new TeacherDao());
        TeacherDao teacherProxy = (TeacherDao) teacherProxyFactory.getProxyInstance();
        teacherProxy.teach();
    }
}
