package org.example.generic;

import org.example.generic.code.Box;

public class Ex1 {

    public static void main(String[] args) {
        Box<String> box = new Box<String>("hello world");
        System.out.println(box.data);

        Box<Integer> integerBox = new Box<>(1);
        System.out.println(integerBox.data);
    }
}
