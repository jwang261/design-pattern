package com.jwang261.prototype;

import java.io.*;

/**
 * @author jwang261
 * @date 2021/2/4 3:58 PM
 */
public class DeepClone implements Serializable, Cloneable {
    String name;
    DeepCloneableTarget deepCloneableTarget;

    public DeepClone(String name, DeepCloneableTarget deepCloneableTarget) {
        super();
    }


    //深拷贝1：重写克隆方法 - 双重浅拷贝 - 不推荐
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        DeepClone deepClone = (DeepClone) deep;
        //单独处理引用
        deepClone.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepClone;
    }

    //深拷贝2：通过对象的序列化实现
    public DeepClone deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;


        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepClone o = (DeepClone)ois.readObject();
            return o;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try{
                bos.close();
                bis.close();
                oos.close();
                ois.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }

    }
}

class DeepCloneableTarget implements Serializable, Cloneable{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String cloneName;

    public DeepCloneableTarget(Integer id, String cloneName) {
        this.id = id;
        this.cloneName = cloneName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}