package com.jwang261.proxy.dynamicProxy;

/**
 * @author jwang261
 * @date 2021/2/4 5:58 PM
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("真实老师上课");
    }
}
