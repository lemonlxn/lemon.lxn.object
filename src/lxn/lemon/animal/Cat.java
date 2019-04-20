package lxn.lemon.animal;

public class Cat extends Animal{

    private double weight;
    public static int price = 20; // 静态成员，或 类成员

    public Cat(){
        System.out.println("I am cat");
    }


    public Cat(String name, int month, double weight){
        super(name,month);
        this.setWeight(weight);

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 静态方法 类方法
    public static void eat(){
        System.out.println("I am eating");
    }

    // 方法重写的时候，需要返回值，参数一致
    // 方法重载的时候，需要参数不一致
    @Override
    public void sleep(String name){
        System.out.println(name);
    }

    public void run(){
        System.out.println("I am running");
    }

    public String info(){
        String str = "hello" + this.getName();

        return str;
    }

}
