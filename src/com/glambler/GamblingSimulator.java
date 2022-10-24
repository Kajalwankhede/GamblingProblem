package com.glambler;
public class GamblingSimulator{
    GamblingSimulator(){
        System.out.println("***WELCOME TO GAMBLING SIMULATOR GAME***");
    }
     final int bet=1;
    final int stakeEveryDay=100;
    public static void main(String[] args) {
        GamblingSimulator simulator=new GamblingSimulator();
        int stake=0;
        stake=stake+simulator.stakeEveryDay;
        System.out.println(" Stake of Glambler Per Day:" +simulator.stakeEveryDay);
        System.out.println(" Bet money for Every game of glambler :"+simulator.bet);

    }
}
