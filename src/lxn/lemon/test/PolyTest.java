package lxn.lemon.test;


import lxn.lemon.polyproj.Animal;
import lxn.lemon.polyproj.Cat;
import lxn.lemon.polyproj.Dog;

/**
 * Author: Lemon
 * Time :  2019-04-21 12:29
 */


public class PolyTest {
    public static void main(String[] args) {
        /** 向上转型  (隐式转型、自动转型) ：小类转为大类
         *  1.父类引用，指向子类实例
         *    (或者说) 将子类对象，转为父类对象
         *
         *  2.可以调用子类重写父类的方法，以及父类派生的方法(如 get/ set方法等)
         *    无法调用子类独有方法
         */

        Animal one   =  new Animal();
        Animal two   =  new Cat();
        Animal three =  new Dog();

        one.eat();      // 动物都有吃东西的能力
        two.eat();      // 猫吃鱼～
        three.eat();    // 小狗吃肉～ 




    }

}
