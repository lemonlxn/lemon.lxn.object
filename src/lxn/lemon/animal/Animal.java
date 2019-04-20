package lxn.lemon.animal;

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
