package lxn.lemon.interfaceproj.interfaceFIle;

/**
 * Author: Lemon
 * Time :  2019-04-23 10:45
 */

public interface INet {

    void network();

    default void connection(){
        System.out.println("我是接口中的连接方法");
    };



}
