package org.example.loop.ex;

public class WhileEx1 {

    public static void main(String[] args) {

        System.out.println("===for===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int count = 1;
        System.out.println("===while===");
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }
}
