package org.launchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi! Can you tell me your name please!");
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();

        System.out.println("Hi " + name + "! Welcome to our opening event! Great to have you!");
    }
}
