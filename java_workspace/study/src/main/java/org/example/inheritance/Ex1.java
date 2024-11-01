package org.example.inheritance;

public class Ex1 {

    public static void main(String[] args) {

        B b = new B();
        b.call();

        A a = new B();
        a.call();
//        a.call2();

        C c = new CImpl();
        c.c();
    }
}
