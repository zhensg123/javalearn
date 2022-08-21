package object;

public class Dog extends Animal {
    private static final String type = "12";
    private double weight;

    public Dog() {
        super(type);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public  void  run(){
        System.out.println("狗在快速奔跑" + this.getName());
    }

}