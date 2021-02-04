package com.jwang261.prototype;

/**
 * @author jwang261
 * @date 2021/2/4 4:51 PM
 */
public class TestDeepClone {
    public static void main(String[] args) {
        DeepClone deepClone = new DeepClone("1",
                new DeepCloneableTarget(1,"target"));
        DeepClone deepClone1 = deepClone.deepClone();
        System.out.println(deepClone1.hashCode());

    }
}
