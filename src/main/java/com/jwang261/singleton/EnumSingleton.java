package com.jwang261.singleton;

/**
 * @author jwang261
 * @date 2021/1/27 4:26 PM
 */
enum EnumSingleton {
    INSTANCE(1,"1");
    public int val;
    public String str;
    public EnumSingleton getInstance() {
        return INSTANCE;
    }


    EnumSingleton(int i, String s) {}



}
