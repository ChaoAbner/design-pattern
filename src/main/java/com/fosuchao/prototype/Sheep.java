package com.fosuchao.prototype;

import java.io.*;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/1/31 11:45
 */
public class Sheep implements Cloneable, Serializable{
    private static final long serialVersionUID = 5402635232427787089L;
    private String color;
    private CookBook cookbook;

    public String getColor() {
        return color;
    }

    public CookBook getCookbook() {
        return cookbook;
    }

    public Sheep(String color, CookBook cookbook) {
        this.color = color;
        this.cookbook = cookbook;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "color='" + color + '\'' +
                ", cookbook=" + cookbook +
                '}';
    }

    public Object clone(){
        // 浅拷贝
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object deepClone() {
        // clone的深拷贝
        Sheep clone = null;
        try {
            clone = (Sheep) super.clone();
            clone.cookbook = (CookBook) this.cookbook.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Object deepCloneBySerialize(){
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 把当前对象以对象流的形式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                ois.close();
                oos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
