package org.example;

public class Game {

    private int score;
    private int[] rolls = new int[21];
    private int numberOfRolls;


    public void roll(int pins) {
        rolls[numberOfRolls++] = pins;
    }

    public int score() {
        int rollindex = 0;
        for (int i = 0; i < 10; i++) {
            if(rolls[rollindex] ==10){
                score+= 10 + rolls[rollindex]+rolls[rollindex+1];
                rollindex++;
            }
            else if (rolls[rollindex] + rolls[rollindex + 1] == 10) {
                score += 10 + rolls[rollindex+2];
                rollindex += 2;
            } else {
                score += rolls[rollindex] + rolls[rollindex + 1];
                rollindex += 2;
            }

        }
        return score;
    }
}
