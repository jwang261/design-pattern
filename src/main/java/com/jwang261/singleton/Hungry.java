package com.jwang261.singleton;

/**
 * @author jwang261
 * @date 2021/1/27 4:26 PM
 */
class Hungry {
    private final static Hungry HUNGRY = new Hungry();
    private static byte[] val = new byte[1024];
    private Hungry() {}
    public static Hungry getInstance() {
        return HUNGRY;
    }
}
