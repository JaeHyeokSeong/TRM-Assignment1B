package org.example.array.ex;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.print(count + "개의 숫자를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;
        System.out.println("total sum: " + sum);
        System.out.println("average: " + average);
    }
}
