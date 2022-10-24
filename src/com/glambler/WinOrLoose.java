package com.glambler;
import java.util.Random;
public class WinOrLoose {
    WinOrLoose(){
        System.out.println("***WELCOME TO GAMBLING SIMULATOR GAME***");
    }
    final int bet=1;
    final int stakeEveryDay=100;

    public static void checkWinOrLoose(GamblingSimulator simulator){
        int stake=0;
        Random random=new Random();
        int bet=random.nextInt(2);
        if(bet==1){
            System.out.println(" Glambler Won The Game");
            stake+=simulator.bet;
        }
        else{
            stake-=simulator.bet;
            System.out.println(" Glambler Loose the game");
        }
    }
    public static void main(String[] args) {
        GamblingSimulator simulator=new GamblingSimulator();
        int stake=0;
        stake=stake+simulator.stakeEveryDay;
        System.out.println(" Stake of Glambler Per Day:" +simulator.stakeEveryDay);
        System.out.println(" Bet money for Every game of glambler :"+simulator.bet);
        checkWinOrLoose(simulator);

    }
}
