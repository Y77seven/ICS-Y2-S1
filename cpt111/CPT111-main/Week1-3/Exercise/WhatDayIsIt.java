import java.util.Scanner;

public class WhatDayIsIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y =  Integer.parseInt(input.nextLine());
        int m = Integer.parseInt(input.nextLine());
        int d = Integer.parseInt(input.nextLine());
        int a = y - (14 - m) / 12;
        int b = a + a / 4 - a / 100 + a / 400;
        int c = m + 12 * ((14 - m) / 12) - 2;
        int day = (d + b + (31 * c) / 12) % 7;
        System.out.println("It's day " + day + " !");
    }
}
