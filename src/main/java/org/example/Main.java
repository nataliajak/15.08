package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float zmiennoPrzecinkowe;
        String text;
        int calkowite;
        long calkowite_wieksze_od_int;
        short calkowiteMniejszeOdInta;
        byte calkowiteMniejszeOdShorta;
        double zmiennoPrzecinkowaWieksza_od_floata;
        boolean true_false;


        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        String name2;
        name2 = "Tomek";
        System.out.println(" Hello, " + name);
        System.out.println("How old are you?");//konkatenacja
        int age = scanner.nextInt();
        if (age <= 18) {
            System.out.println(name + " You can't come in");
        } else {
            System.out.println("Come in");
        } if (age >= 18 && age <= 30 && name2.equals(name)) {
            System.out.println(name + "! You Lucky! Get 20% cut!");
        } else {
            System.out.println();
        }
    }
}