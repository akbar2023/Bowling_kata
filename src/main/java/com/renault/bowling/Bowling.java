package com.renault.bowling;

public class Bowling {
    public int calculateScore(int[] rolls) {
        int score = 0;
        boolean shifted = false;
        for (int i = 0; i < rolls.length; i++) {

            score += rolls[i];
            int bonus = calculateBonus(shifted, i, rolls);
            score += bonus;

            if (rolls[i] == 10) {
                shifted = !shifted;
            }
        }
        return score;
    }

    private int calculateBonus(boolean shifted, int i, int[] rolls) {
        int bonus = 0;

        if (i + 2 >= rolls.length) {
            return 0;
        }

        if (i % 2 == (shifted ? 1 : 0) && rolls[i] + rolls[i + 1] == 10) {
            bonus = rolls[i + 2];
        }

        if (rolls[i] == 10) {
            bonus = rolls[i + 1] + rolls[i + 2];
        }

//        if (i == 1 && score == 10) {
//            bonus = rolls[i + 1];
//        } else if (i == 3 && score == 10) {
//            bonus = rolls[i + 1];
//        }
        return bonus;
    }
}
