package com.jwang261.proxy.staticProxy;

/**
 * @author jwang261
 * @date 2021/2/4 5:52 PM
 */

/**
 * 静态代理：代理对象和真实对象实现相同的接口。
 * 创建代理对象传入真实对象作为属性
 * 代理方法时在调用真实对象方法的前后增加额外的操作
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
