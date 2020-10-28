package com.codedifferently.part02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TooHighTooLow {

    public static void main(String[] args) {
            // I did this challenge two different ways

            // FIRST ATTEMPT IS WITH LIMITED TRIES
            System.out.printf("Let's play a game.%nIf you guess the number I am thinking of you win a Mercedes Benz AMG.%nPick a number 1 through 10.%n");
            Scanner input = new Scanner(System.in);

            //generate answer by random
            Random generator = new Random();
            int answer = generator.nextInt(10);
            int attempts = 5;
            System.out.println(answer);

            //prompt the user to guess a number
            int guess;
            ArrayList<Integer> inputStorage = new ArrayList<>();

            //make the game repeat until the guess is correct
            for (int i = 0; i <= attempts; i++) {

                guess = input.nextInt();

                //once game is over let the player known the number of guesses before successful
                int[] guessAttempted = new int[i];
                int numOfAttempts = guessAttempted.length + 1;

                //User can't guess the same number twice
                if (!inputStorage.contains(guess)) {

                    //let the player know if their number is small, large, or correct
                    if (guess < answer) {
                        System.err.println("Your guess is less than the answer");
                        System.out.printf("This your %sth time.%nTry again:%n", numOfAttempts);
                    } else if (guess > answer) {
                        System.err.println("Your guess is more than the answer");
                        System.out.printf("This your %sth time.%nTry again:%n", numOfAttempts);
                    } else {
                        System.out.printf("YOU GUESSED THE NUMBER!!\n" + "Attempts made: " + numOfAttempts + " times.\n");
                        return;
                    }
                } else {
                    i--;
                    System.out.println("You have guessed that number");
                }

                inputStorage.add(guess);
            }
            System.out.println("GAME IS OVER");


        /*
        //SECOND ATTEMPT IS  WITH INFINITE TRIES

        //generate random number
        Random generator = new Random();
        int answer = generator.nextInt(10);
        System.out.printf("Here is the answer:%n%s%n____________%n",
                answer);

        //prompt the user to guess
        int guess;
        int attempts = 0;
        //start the game

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> inputStorage = new ArrayList<>();
        System.out.println("LET'S PLAY A GAME");


        do {
            System.out.println("Guess a number from 1 through 10");
            guess = input.nextInt();

            System.out.println("You guessed: " + guess);

            if(!inputStorage.contains(guess)){

                //display variation of too large, too small, correct
                if (guess > answer) {
                    System.out.println("This number is too large");
                    attempts++;


                } else if (guess < answer) {
                    System.out.println("This number is to small");
                    attempts++;

                }
                else {
                    System.out.println("YOU WON THE GAME");
                    attempts++;
                }
            }
            else {
                System.out.println("you have already guess that number");
            }

            inputStorage.add(guess);
        }
        while (answer != guess);{
            input.close();
            System.out.println("You attempted " + attempts);
        }

         */
    }
}
