package com.glambler;

import java.util.Random;

public class GamblingSimulation {
    static int stake = 100;
    static int bet = 1;

    public static void main (String[] args) {
        System.out.println("\nWelcome to Gambling Simulation Problem");
        System.out.println("\nGambler every day stake is " + stake);
        System.out.println("Bet is " + bet);
        winOrLooseGame();

    }
    public static void winOrLooseGame() {
        Random random = new Random();
        int bet = random.nextInt(2);
        if (bet== 1) {
            System.out.println("\nGambler make $1 Win the bet");
        } else {
            System.out.println("\nGambler loose the bet");
        }

    }

}