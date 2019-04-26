package lxn.lemon.interfaceproj;

/**
 * Author: Lemon
 * Time :  2019-04-23 16:39
 */

interface One{
    static int x = 11;
}

interface Two{
    final int x = 22;
}

class Three{
    public static int x = 33;
}

public class Test extends Three implements One,Two{
    public void test(){
        //System.out.println(x);  此处会报错，需特指是哪个接口的x
        System.out.println(One.x);
        System.out.println(Two.x);
        //System.out.println(Test.x);
    }

    public static void main(String[] args) {
        new Test().test();
    }
}


