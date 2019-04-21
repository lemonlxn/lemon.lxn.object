package lxn.lemon.abstractproj;

/**
 * Author: Lemon
 * Time :  2019-04-21 12:18
 * 特点 ：  研究抽象类
 */

public abstract class Animal {
    /**
     * 类，添加 abstract 关键字，则变为抽象类
     * 特点：
     *     1.不允许实例化
     *     2.可以通过向上转型，指向子类实例
     */
    private String name;
    private int month;

    public Animal(){

    }

    public Animal(String name,int month){
        this.setName(name);
        this.setMonth(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 方法，添加 abstract，则变为抽象方法
     * 特点：
     *     1.父类没有方法体；
     *     2.子类需重写该方法。
     *     3.子类若不想重写该方法，则子类也必须为抽象类
     *     4.抽象类，可以没有抽象方法。但，含有抽象方法的类，一定为抽象类。
     *     5.abstract 关键字，不能与 static final private 搭配
     */
    public abstract void eat();
}
