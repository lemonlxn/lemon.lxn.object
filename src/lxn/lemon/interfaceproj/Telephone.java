package lxn.lemon.interfaceproj;

/**
 * Author: Lemon
 * Time :  2019-04-22 21:57
 * 新增接口知识点
 */


public class Telephone {
    /**
     * 原始手机
     */

    private String brand;
    private int price;

    public Telephone(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(){
        System.out.println("手机可以打电话");
    }
}
