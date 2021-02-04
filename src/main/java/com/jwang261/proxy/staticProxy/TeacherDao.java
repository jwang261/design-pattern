package com.jwang261.proxy.staticProxy;

/**
 * @author jwang261
 * @date 2021/2/4 5:47 PM
 */
public class TeacherDao implements ITeacherDao{

    public void teach() {
        System.out.println("真实老师上课");
    }
}
