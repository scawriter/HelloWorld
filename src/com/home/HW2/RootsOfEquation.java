package com.home.HW2;

import java.util.Scanner;

public class RootsOfEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициент a:");
        int a = scanner.nextInt();

        System.out.println("Введите коэффициент b:");
        int b = scanner.nextInt();

        System.out.println("Введите коэффициент c:");
        int c = scanner.nextInt();
        long discriminant = discriminant(a, b, c);
        double root1 = 0;
        double root2 = 0;

        if (!isPositive(discriminant)) {
            System.out.println("Уравнение не имеет корней.");
        } else {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " и " + root2 + " - корни уравнения.");
        }
        if (isZero(discriminant)) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(root1 + " - корень уравнения.");
        }
    }

    public static long discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static boolean isPositive(long value) {
        return value > 0;
    }

    public static boolean isZero(long value) {
        return value == 0;
    }
}
