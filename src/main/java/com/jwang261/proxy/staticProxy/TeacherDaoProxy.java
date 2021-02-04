package com.jwang261.proxy.staticProxy;

/**
 * @author jwang261
 * @date 2021/2/4 5:47 PM
 */
//static proxy
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("Start Proxy");
        target.teach();
        System.out.println("End Proxy");
    }
}
