package org.example.collection;

import java.util.ArrayList;

public class ArrayEx1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
