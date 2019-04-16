package com.home.HW2;

import com.itacademy.lesson2.FifthTask;

import java.util.Scanner;

public class PrintNextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (FifthTask.isDateValid(day + 1, month, year)) {
            nextDay(day + 1, month, year);
        } else {
            if (FifthTask.isDateValid(1, month + 1, year)) {
                nextDay(1, month + 1, year);
            } else {
                nextDay(1, 1, year + 1);
            }
        }
    }

    public static void nextDay(int day, int month, int year) {
        System.out.println(day + "." + month + "." + year);
    }
}
