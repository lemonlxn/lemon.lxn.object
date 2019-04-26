package lxn.lemon.interfaceproj;

import lxn.lemon.interfaceproj.interfaceFIle.INet;
import lxn.lemon.interfaceproj.interfaceFIle.IPhoto;

/**
 * Author: Lemon
 * Time :  2019-04-22 22:09
 */

public  class FourthPhone extends ThirdPhone implements IPhoto, INet {

    @Override
    public void photo(){
        System.out.println("手机可以拍照");
    }

    @Override
    public void network(){
        System.out.println("手机可以上网");
    }

    @Override
    public void connection() {
        INet.super.connection(); // 接口调用默认方法
        System.out.println("手机可以连接网络");
    }

    public void game(){
        System.out.println("手机可以玩游戏");
    }

}
