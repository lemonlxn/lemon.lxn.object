package lxn.lemon.polyproj;

/**
 * Author: Lemon
 * Time :  2019-04-21 19:27
 */
public class Master {
    /**
     * 编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
     * 1. Cat temp = (Cat) obj;   temp.run();   等同于下行
     *    ((Cat) obj).run();
     * 2.  Dog temp2 = (Dog) obj; temp2.sleep(); 等同于下行
     *    ((Dog) obj).sleep();
     */

    public void feed(Animal obj){
        obj.eat();
        if (obj instanceof Cat){
            Cat temp = (Cat) obj;
            temp.run();

        }
        else if (obj instanceof Dog){
            Dog temp2 = (Dog) obj;
            temp2.sleep();
        }
    }

}
