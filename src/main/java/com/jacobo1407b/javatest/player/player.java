package com.jacobo1407b.javatest.player;

public class player {

    private Dice dice;
    private int minNumberToWin;

    public player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }


    public boolean play(){
        int diceNumber = dice.roll();
        return diceNumber > minNumberToWin;
    }
}
