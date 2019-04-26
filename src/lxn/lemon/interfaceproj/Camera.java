package lxn.lemon.interfaceproj;

import lxn.lemon.interfaceproj.interfaceFIle.IPhoto;

/**
 * Author: Lemon
 * Time :  2019-04-23 10:36
 */

public class Camera implements IPhoto {
    @Override
    public void photo(){
        System.out.println("照相机拍照");
    }

    @Override
    public void video() {
        IPhoto.super.video();
    }
}
