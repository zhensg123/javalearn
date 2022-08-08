package object;

public class JavaObject {
    private  String name;
    public  static int month;
    double weight;

    public static void eat(){
//        this.month = 777;  静态方法不能使用this
        System.out.println("吃鱼");
    }
    public void run(){
        System.out.println("小猫快跑");
    }

    public   int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
