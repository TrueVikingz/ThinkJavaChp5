package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println("\nHello, and welcome back.\n");
        converter();

    }

    public static void converter(){

        Scanner in = new Scanner(System.in);
        int input;
        int N=7;
        int i, guess;

        int number = 1 + (int)(100 * Math.random());

        for (i = 0; i < N; i++){
            System.out.println("Guess the number:");
            guess = in.nextInt();
            if (number == guess) {
                System.out.println("You did it! You guessed the number!");
                break;
            }
            else if (number > guess && i != N - 1) {
                System.out.println("You need to guess higher than " + guess);
            }
            else if (number < guess && i != N - 1) {
                System.out.println("You need to guess lower than " + guess);
            }
        }

        if (i == N) {
            System.out.println("You have exhausted" + " K trials.");
            System.out.println("The number was " + number);
        }
    }
}