package org.example;

public class Game {


    private int[] rolls = new int[21];
    private int numberOfRolls;


    public void roll(int pins) {
        rolls[numberOfRolls++] = pins;
    }

    public int score() {
        int score = 0;
        int rollindex = 0;
        for (int i = 0; i < 10; i++) {
            if(isStrike(rollindex)){
                score+= 10 + StrikeBonus(rollindex);
                rollindex++;
            }
            else if (isSpare(rollindex)) {
                score += 10 + SpareBonus(rollindex);
                rollindex += 2;
            } else {
                score += frameScore(rollindex);
                rollindex += 2;
            }

        }
        return score;
    }




    private boolean isStrike(int rollindex) {
        return rolls[rollindex] == 10;
    }

    private int StrikeBonus (int rollindex){
        return rolls[rollindex+1] +rolls [rollindex+2];
    }



    private boolean isSpare(int rollindex) {
        return rolls[rollindex] + rolls[rollindex + 1] == 10;
    }

    private int SpareBonus(int rollindex) {
        return rolls[rollindex + 2];
    }

    private int frameScore(int rollindex) {
        return rolls[rollindex] + rolls[rollindex + 1];
    }


}

