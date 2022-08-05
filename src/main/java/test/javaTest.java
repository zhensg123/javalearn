package test;

import object.JavaObject;

public class javaTest {
    public static void main(String[] args) {
        JavaObject cat = new JavaObject();
        JavaObject tt = cat;
        cat.eat();
        cat.run();
        System.out.println(cat == tt);
    }
}
