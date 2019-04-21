package lxn.lemon.test;

import lxn.lemon.extendsproj.Cat;

public class ExtendsTest {

    public static void main(String[] args) {


	// write your code here
        Cat cat1 = new Cat("lemon",3,2);
        Cat cat2 = new Cat("lemon",3,2);

        boolean flag = cat1.equals(cat2);
        System.out.println(flag); // 继承Object 对象，比较的是内存地址是否一致；

        String str1 = new String("hello");
        String str2 = new String("hello");

        boolean flag2 = str1.equals(str2); // String对象，重写了equals方法，比较的是值是否一致
        System.out.println(flag2);

        System.out.println(cat1.toString());
        System.out.println(cat1);

        

    }
}
