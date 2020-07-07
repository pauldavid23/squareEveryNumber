package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number to square: ");

        int num = scanner.nextInt();
        int firstNum = num;
        num *= num;

        System.out.println("The square of " + firstNum + " is " + num);


    }
}
