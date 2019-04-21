package lxn.lemon.test;

import lxn.lemon.abstractproj.Animal;
import lxn.lemon.abstractproj.Cat;


/**
 * Author: Lemon
 * Time :  2019-04-21 20:19
 */
public class abstractTest {
    public static void main(String[] args) {

        /**
         * 特点：
         *      1.由于 Animal为抽象类，可通过向上转型的方式，完成实例化
         *      2.父类抽象方法，不需要具体实现方法体
         *      3.继承 Animal 抽象类的子类，必须重写父类抽象方法
         */

        Animal animal = new Cat();
        animal.eat();



    }
}
