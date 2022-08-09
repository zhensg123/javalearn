package object;

public class JavaObject {
    String name;
    int month;
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
    public void eat(){
        run();
        System.out.println(this.weight);
    }
    public void run(){
        System.out.println("小猫快跑");
    }
}
