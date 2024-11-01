package org.example.loop.ex;

public class ForEx2 {

    public static void main(String[] args) {

        int num = 2;

        for (int i = 0; i < 10; ) {

            if (num % 2 == 0) {
                System.out.println(num);
                i++;
            }
            num += 1;
        }
    }
}
