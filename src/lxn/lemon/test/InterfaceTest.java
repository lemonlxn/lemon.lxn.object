package lxn.lemon.test;

import lxn.lemon.interfaceproj.Camera;
import lxn.lemon.interfaceproj.FourthPhone;
import lxn.lemon.interfaceproj.interfaceFIle.INet;
import lxn.lemon.interfaceproj.interfaceFIle.IPhoto;

/**
 * Author: Lemon
 * Time :  2019-04-22 22:25
 * 接口测试
 */

public class InterfaceTest {

    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.call();
        phone.game();

        System.out.println("========================");

        IPhoto iPhoto = new FourthPhone();
        iPhoto.photo();

        IPhoto iPhoto1 = new Camera();
        iPhoto1.photo();

        System.out.println("========================");

        System.out.println(IPhoto.temp);
        iPhoto.video();
        iPhoto.photo();

        System.out.println("========================");

        INet inet = new FourthPhone();
        inet.connection();




    }

}
