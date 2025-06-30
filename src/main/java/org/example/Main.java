
// Created by Kayne Rodrigo
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        float Celcius = sc.nextFloat();

        float Fahrenheit = Celcius * ((float) 9 /5) + 32;
        String finalAnswer = String.format("%.2f", Fahrenheit);
        System.out.println("Temperature in Fahrenheit: " + finalAnswer);
    }
}