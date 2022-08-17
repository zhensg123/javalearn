package object;

public class JavaObject {
    private  String name;
    public  static int month;
    double weight;

    public  JavaObject(){
       System.out.println("这是输出项目");
    }
    public  JavaObject(String name, int month, double weight){
        this();
      this.name = name;
      this.month = month;
      this.weight = weight;
    }
    public void eat() {
        run();
        System.out.println(this.weight);
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
