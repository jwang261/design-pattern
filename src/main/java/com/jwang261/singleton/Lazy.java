package com.jwang261.singleton;

/**
 * @author jwang261
 * @date 2021/1/27 4:26 PM
 */
class Lazy {
    private volatile static Lazy lazy;
    private Lazy() {}
    public static Lazy getInstance(){
        if(lazy == null){
            synchronized (Lazy.class) {
                if(lazy == null){
                    lazy = new Lazy();
                }
            }
        }

        return lazy;
    }

}
