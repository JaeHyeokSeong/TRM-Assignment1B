package org.example.inheritance;

public class B extends A {

    @Override
    public void call() {
        System.out.println("b");
    }

    public void call2() {
        System.out.println("bb");
    }
}
