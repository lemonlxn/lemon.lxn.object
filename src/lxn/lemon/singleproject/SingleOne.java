package lxn.lemon.singleproject;

/**
 * Author: Lemon
 * Time :  2019-04-20 17:41
 */

public class SingleOne {
    /**
     * 饿汉式：创建对象，直接实例初始化
     * 特点：空间换取时间
     * 1.创建私有类构造方法
     * 2.创建私有静态实例
     * 3.创建共有静态方法，并返回
     */
    private SingleOne(){}

    private static SingleOne instance = new SingleOne();

    public static SingleOne getInstance(){
        return instance;
    }

    @Override
    public String toString(){
        return "SingleOne";
    }




}
