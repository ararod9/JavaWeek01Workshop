package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        //get the user to prompt their name
        System.out.printf("What's your name?%n");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        //greet users who name is Hakim or Rasheeda
        if(name.equalsIgnoreCase("Hakim") || name.equalsIgnoreCase("Rasheeda")){
            System.out.printf("What's up %s %n", name);
        }
        //Tell users who are not named user their not welcomed
        else {
            System.err.printf("You are not welcome here %s %n", name);
        };
    }
}
