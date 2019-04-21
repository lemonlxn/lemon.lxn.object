package lxn.lemon.polyproj;

/**
 * Author: Lemon
 * Time :  2019-04-21 12:18
 * 特点 ：  研究多态特性
 */

public class Animal {
    private String name;
    private int month;

    public Animal(){

    }

    public Animal(String name,int month){
        this.setName(name);
        this.setMonth(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public void eat(){
        System.out.println("动物都有吃东西的能力");
    }
}
