package lxn.lemon.singleproject;

/**
 * Author: Lemon
 * Time :  2019-04-20 22:12
 */

public class SingleTwo {

    /**
     * 饱汉式：创建对象，不直接实例初始化，而是在调用的时候实例化
     * 特点：时间换取空间
     * 1.创建私有构造方法
     * 2.创建私有静态实例，赋值为null
     * 3.创建公有静态方法，实例化对象
     */

    private SingleTwo(){}

    private static SingleTwo instance = null;

    public static SingleTwo getInstance(){
        if (instance == null)
            instance = new SingleTwo();
        return instance;
    }

    @Override
    public String toString(){
        return "SingleTwo";
    }



}
