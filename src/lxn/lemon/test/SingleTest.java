package lxn.lemon.test;
import lxn.lemon.singleproject.SingleOne;
import lxn.lemon.singleproject.SingleTwo;

/**
 * Author: Lemon
 * Time :  2019-04-20 17:46 
 */

public class SingleTest {
    public static void main(String[] args) {
        SingleOne one = SingleOne.getInstance();

        SingleTwo two = SingleTwo.getInstance();

        System.out.println(one);
        System.out.println(two);

    }


}
