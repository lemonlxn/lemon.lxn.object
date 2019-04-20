package lxn.lemon.car;

public class Tricycle extends NonMotor {
    // 在无参构造中实现对轮子属性值进行修改
    public Tricycle(){
        this.setWheel(3);
    }

    // 重写运行方法，描述内容为：三轮车是一款有**个轮子的非机动车。
    @Override
    public String work(){
        String str = "三轮车是一款有" + this.getWheel() + "个轮子的非机动车。";
        return str;
    }

}
