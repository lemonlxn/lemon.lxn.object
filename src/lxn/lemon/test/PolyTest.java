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

        System.out.println("========================");

        /** 向下转型 (强制类型转换) ：类型需要被强制转换
         *  1.子类引用，指向父类对象。
         *    可以调用子类特有的方法
         *  2.类型强制转换，需要是父与子的关系，而不是兄弟关系。
         *  3.其他注意点：
         *      temp  是 Cat 子类引用，   指向 Cat 实例
         *      temp2 是 Dog 子类引用，不能指向 Cat 实例
         */


        if (two instanceof Cat){
            Cat temp = (Cat) two;
            temp.run();
            temp.eat();
            System.out.println("two 可以转为Cat类型");
        }

        else if (two instanceof Dog){
            Dog temp2 = (Dog) two;
            temp2.eat();
            System.out.println("two 可以转为Dog类型");
        }
        else
            System.out.println("结束");




    }

}
