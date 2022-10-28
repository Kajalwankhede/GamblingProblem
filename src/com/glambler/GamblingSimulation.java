package com.glambler;

import java.util.Random;

public class GamblingSimulation {
    static int stake = 100;
    static int bet = 1;

    static int totalWiningAmount=0;

    public static void main(String[] args) {
        System.out.println("\nWelcome to Gambling Simulation Problem");
        System.out.println("\nGambler every day stake is " + stake);
        System.out.println("Bet is " + bet);
        winOrLooseGame();

        winOrLooseAmount();

    }

    public static void winOrLooseGame() {
        Random random = new Random();
        int bet = random.nextInt(2);
        if (bet == 1) {
            System.out.println("\nGambler make $1 Win the bet");
        } else {
            System.out.println("\nGambler loose the bet");
        }

    }

    public static int resignForTheDay() {
        while (stake != 50 && stake != 110) {
            System.out.println("--------------------------------");
            Random random = new Random();
            int randomCheck = random.nextInt(2);
            if (randomCheck == 0) {
                stake = stake - bet;
                System.out.println("Gambler Lost 50% of stake....You have to resign for the day");
            } else {
                stake = stake + bet;
                System.out.println("Gambler Won 50% of stake...You have to resign for the day");
                System.out.println("Stake value is " + stake);
            }
        }
        return stake;
    }
    public static int winOrLooseAmount(){

        for (int i=0; i<=20; i++){
            while (stake != 50 && stake != 110) {
                System.out.println("--------------------------------");
                Random random=new Random();
                int randomcheck = random.nextInt(2);
                if (randomcheck == 0) {
                    stake = stake - bet;
                } else {
                    stake = stake + bet;
                }
                int dayWinningAmount=stake-100;
                System.out.println(" Amount for won day: "+ i+ 1 +dayWinningAmount);
                totalWiningAmount=totalWiningAmount+dayWinningAmount;
            }

        }
        return totalWiningAmount;
    }
}