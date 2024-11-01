package org.example.loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }
    }
}
