package lxn.lemon.test;

import lxn.lemon.car.Bicycle;
import lxn.lemon.car.ElectricVehicle;
import lxn.lemon.car.NonMotor;
import lxn.lemon.car.Tricycle;

public class CarTest {
    public static void main(String[] args){
        System.out.println("父类信息测试：");
        NonMotor non = new NonMotor("红颜色","天宇",4,2);
        System.out.println(non.work());
        System.out.println("========================");

        System.out.println("自行车类信息测试：");
        Bicycle bicycle = new Bicycle("黄颜色","捷安特");
        System.out.println(bicycle.work());
        System.out.println("========================");

        System.out.println("电动车类信息测试：");
        ElectricVehicle ev = new ElectricVehicle("飞鸽");
        System.out.println(ev.work());

        System.out.println("========================");
        System.out.println("三轮车类信息测试：");

        Tricycle tc = new Tricycle();
        System.out.println(tc.work());

    }
}
