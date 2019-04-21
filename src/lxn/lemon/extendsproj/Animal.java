package lxn.lemon.extendsproj;

/**
 * Author: Lemon
 * Time :  2019-04-19 10:18
 * 特点 ：  新增继承特性
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

    public void sleep(String name){
        System.out.println( name + " is sleeping");
    }

    @Override
    public String toString(){
        return  "hello " + this.getName() ;
    }
}
