package PrototypePattern.deepclone;

import java.io.*;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 12:40
 */
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepProtoType() {
    }

    // 深拷贝，方法一, 使用clone方法
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Object res = null;
//        // 这里完成对基本数据类型的拷贝(也会拷贝上引用类型，不过拷贝的是栈内存中的地址)
//        res = super.clone();
//        // 对引用类型单独处理(将object转为DeepProtoType，也就是浅拷贝克隆后的对象)
//        DeepProtoType deepProtoType = (DeepProtoType)res;
//        // 将对象里面的引用类型再拷贝一份
//        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
//        return  deepProtoType;
//    }

    // 深拷贝 通过对象的序列化实现（推荐）
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // this指向这个函数的调用者，，当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType = (DeepProtoType)ois.readObject();

            return deepProtoType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
