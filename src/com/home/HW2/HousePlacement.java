package com.home.HW2;

import java.util.Scanner;

public class HousePlacement {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите 1-ю сторону 1-го дома:");
//        int a = scanner.nextInt();
//
//        System.out.println("Введите 2-ю сторону 1-го дома:");
//        int b = scanner.nextInt();
//
//        System.out.println("Введите 1-ю сторону 2-го дома:");
//        int c = scanner.nextInt();
//
//        System.out.println("Введите 2-ю сторону 2-го дома:");
//        int d = scanner.nextInt();
//
//        System.out.println("Введите 1-ю сторону участка:");
//        int e = scanner.nextInt();
//
//        System.out.println("Введите 2-ю сторону участка:");
//        int f = scanner.nextInt();
//
//        System.out.println(isHousePlacement(a, b, c, d, e, f));
        System.out.println(isHousePlacement(20, 70, 25, 50, 100, 150)); //true
        System.out.println(isHousePlacement(10, 60, 10, 15, 20, 50)); //false
        System.out.println(isHousePlacement(25, 150, 25, 150, 50, 150)); //true
        System.out.println(isHousePlacement(50, 75, 50, 75, 50, 150)); //true
        System.out.println(isHousePlacement(115, 50, 110, 100, 200, 300)); //true
        System.out.println(isHousePlacement(1, 3, 2, 2, 2, 4)); //false
        System.out.println(isHousePlacement(1, 3, 2, 3, 2, 5)); //false
        System.out.println(isHousePlacement(2, 2, 1, 4, 2, 5)); //false
        System.out.println(isHousePlacement(2, 2, 2, 2, 3, 3)); //false
        System.out.println(isHousePlacement(10, 1, 10, 1, 2, 10)); //true
        System.out.println(isHousePlacement(1, 10, 1, 10, 10, 2)); //true
        System.out.println(isHousePlacement(1, 10, 10, 1, 2, 10)); //true
        System.out.println(isHousePlacement(10, 1, 1, 10, 10, 2)); //true
        System.out.println(isHousePlacement(1, 10, 10, 1, 10, 2)); //true
        System.out.println(isHousePlacement(10, 1, 1, 10, 2, 10)); //true
        System.out.println(isHousePlacement(1, 1, 2, 3, 2, 3)); //false
        System.out.println(isHousePlacement(1, 1, 3, 3, 2, 4)); //false
        System.out.println(isHousePlacement(1, 3, 3, 3, 2, 6)); //false
        System.out.println(isHousePlacement(1, 2, 98, 150, 100, 150)); //true
    }

    public static boolean isHousePlacement(int a, int b, int c, int d, int e, int f) {
        //Дома стоят вдоль e (4 варианта)
        boolean e1 = (f >= b && f >= c && e >= (a + d));
        boolean e2 = (f >= a && f >= c && e >= (b + d));
        boolean e3 = (f >= b && f >= d && e >= (a + c));
        boolean e4 = (f >= a && f >= d && e >= (b + c));
        //Дома стоят вдоль f (4 варианта)
        boolean f1 = (e >= b && e >= c && f >= (a + d));
        boolean f2 = (e >= a && e >= c && f >= (b + d));
        boolean f3 = (e >= b && e >= d && f >= (a + c));
        boolean f4 = (e >= a && e >= d && f >= (b + c));
        return e1 || e2 || e3 || e4 || f1 || f2 || f3 || f4;
    }
}
