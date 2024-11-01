package org.example.array.ex;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        double average;

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        average = (double) total / numbers.length;

        System.out.println("total: " + total);
        System.out.println("average: " + average);
    }
}
