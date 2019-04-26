package lxn.lemon.interfaceproj.interfaceFIle;

/**
 * Author: Lemon
 * Time :  2019-04-23 10:13
 *
 * 特点
 *      1.通过接口，来实现特定功能。
 *      2.常量：
 *              1.常量定义的时候，必须初始化。
 *              2.
 *      3.方法：
 *              1.在接口中，默认访问权限为 public
 *              2.在接口中，不需要书写 abstract 关键字，默认为抽象方法
 *              3.默认方法，是在jdk 1.8后加入的，目的是为了方便代码编写者，可以方便重写指定方法体，而不需要全部重写
 *                类，在重写接口中的默认方法时，调用默认方法的格式为：<接口名>.super.<默认方法名>
 *
 *              4.静态方法，是在jdk 1.8后加入的，子类可以去继承，但是无法重写
 *              5.除了 default (默认方法) static (静态方法)外，抽象方法不需要书写方法体。
 *              6.当一个类实现接口的时候，需要重写接口中所有的抽象方法。
 *                如果类不想实现所有的抽象方法，需要将类设置为一个抽象类。
 *                继承该类的子类们 (子类、子子类、子子子类等)，也需要重写接口中所有的抽象方法，否则需要设置为一个抽象类
 *
 */

public interface IPhoto {
    // 定义一个具有照相能力的接口
    // 接口中，方法 与 常量，可以由下方所示进行省略。

    // public void photo();
    // public static final int temp = 20;
    // void video();

    void photo();
    int temp = 20;



    default void video(){
        System.out.println("我是接口中的默认方法");
    }

    static void stop(){
        System.out.println("我是接口中的静态方法");
    }


}
