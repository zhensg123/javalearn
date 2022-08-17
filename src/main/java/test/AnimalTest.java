package test;

import object.Cat;
import object.Dog;
public class AnimalTest {
    public  static  void main(String[] args){
        Cat cat = new Cat();
        cat.setSex("女");
        Dog dog = new Dog();
        dog.setWeight(111.2);

        System.out.println(dog.toString());
    }
}
