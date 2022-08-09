package test;

import object.JavaObject;

public class javaTest {
    public static void main(String[] args) {
        JavaObject cat = new JavaObject("22", 1, 1.1);
        JavaObject tt = cat;
        cat.eat();
        cat.run();
        System.out.println(cat == tt);
    }
}
