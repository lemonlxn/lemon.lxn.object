package lxn.lemon.test;


import lxn.lemon.polyproj.Animal;
import lxn.lemon.polyproj.Cat;
import lxn.lemon.polyproj.Dog;
import lxn.lemon.polyproj.Master;

/**
 * Author: Lemon
 * Time :  2019-04-21 12:29
 */


public class PolyTest {
    public static void main(String[] args) {
        /** 向上转型  (隐式转型、自动转型) ：小类转为大类
         *
         *  1.父类引用，指向子类实例
         *    (或者说) 将子类对象，转为父类对象
         *
         *  2.可以调用子类重写父类的方法，以及父类派生的方法(如 get/ set方法等)
         *    无法调用子类独有方法
         */

        Animal animal   =  new Animal();
        Animal cat      =  new Cat();
        Animal dog      =  new Dog();

        animal.eat();      // 动物都有吃东西的能力
        cat.eat();         // 猫吃鱼～
        dog.eat();         // 小狗吃肉～

        System.out.println("========================");

        /** 向下转型 (强制类型转换) ：类型需要被强制转换
         *  1.子类引用，指向父类对象。
         *    可以调用子类特有的方法
         *  2.类型强制转换，需要是父与子的关系，而不是兄弟关系。
         *  3.其他注意点：
         *      temp  是 Cat 子类引用，   指向 Cat 实例
         *      temp2 是 Dog 子类引用，不能指向 Cat 实例
         */

        if (cat instanceof Cat){
            Cat temp = (Cat) cat;
            temp.run();
            temp.eat();
            System.out.println("cat 可以转为Cat类型");
        }

        else if (cat instanceof Dog){
            Dog temp2 = (Dog) cat;
            temp2.eat();
            System.out.println("cat 可以转为Dog类型");
        }
        else
            System.out.println("结束");

        System.out.println("========================");

        /**
         * 根据对象类型的不同，返回相应的结果
         */

        Master master = new Master();
        master.feed(cat);
        master.feed(dog);





    }

}
