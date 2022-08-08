package object;

public class Cat extends  Animal{
    private String  sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public  void  sleep(){
        System.out.println("在睡觉呢" + this.getName());
   }

}
