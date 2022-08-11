package test;

import object.Animal;
import object.Cat;
import object.Dog;

public class AnimalTest2 {
    public  static  void main(String[] args){
        Animal cat = new Cat();
        cat.eat();
        Animal dog = new Dog();
        dog.eat();

        Cat one = (Cat)dog;

    }
}
