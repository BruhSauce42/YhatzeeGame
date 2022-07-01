import java.util.ArrayList;

public class Game {
    Dice die_one;
    Dice die_two;
    Dice die_three;
    Dice die_four;
    Dice die_five;
    Dice die_six;
    ArrayList<Dice> saved;
    ArrayList<Dice> cup;
    int round;
    int rollNumber;
    ScoreCard scoreCard;
    int potentialChance;

    public Game() {
        die_one = new Dice(6);
        die_two = new Dice(6);
        die_three = new Dice(6);
        die_four = new Dice(6);
        die_five = new Dice(6);
        die_six = new Dice(6);
        saved = new ArrayList<Dice>();
        cup = new ArrayList<Dice>();
        round = 0;
        rollNumber = 1;
        scoreCard = new ScoreCard();
    }

    void roll(ArrayList<Dice> dice) {
        for (Dice d : dice) {
            d.rollDie();
        }
        scoreCard.updateTable(dice);
        scoreCard.updatePotentials();

    }

    void printScoreCard() {
        if (scoreCard.getOnes() != -1) {
            System.out.println("Ones: " + scoreCard.getOnes());
        } else {
            System.out.println("Ones Could Be:" + scoreCard.getPotentialOnes());
        }
        if (scoreCard.getTwos() != -1) {
            System.out.println("Twos: " + scoreCard.getTwos());
        } else {
            System.out.println("Twos Could Be: " + scoreCard.getPotentialTwos());
        }
        if (scoreCard.getThrees() != -1) {
            System.out.println("Threes: " + scoreCard.getThrees());
        } else {
            System.out.println("Threes Could Be: " + scoreCard.getPotentialThrees());
        }
        if (scoreCard.getFours() != -1) {
            System.out.println("Fours: " + scoreCard.getFours());
        } else {
            System.out.println("Fours Could Be: " + scoreCard.getPotentialFours());
        }
        if (scoreCard.getFives() != -1) {
            System.out.println("Fives: " + scoreCard.getFives());
        } else {
            System.out.println("Fives Could Be: " + scoreCard.getPotentialFives());
        }
        if (scoreCard.getSixes() != -1) {
            System.out.println("Sixes: " + scoreCard.getSixes());
        } else {
            System.out.println("Sixes Could Be: " + scoreCard.getPotentialSixes());
        }
        if (scoreCard.getThreeKind() != -1) {
            System.out.println("Three of a Kind: " + scoreCard.getThreeKind());
        } else {
            System.out.println("Three of a Kind Could Be:" + scoreCard.getPotentialThreeKind());
        }
        if (scoreCard.getFourKind() != -1) {
            System.out.println("Four of a Kind: " + scoreCard.getFourKind());
        } else {
            System.out.println("Four of a Kind Could Be:" + scoreCard.getPotentialFourKind());
        }
        if (scoreCard.getFullHouse() != -1) {
            System.out.println("Full House: " + scoreCard.getFullHouse());
        } else {
            System.out.println("Full House Could Be:" + scoreCard.getPotentialFullHouse());
        }
        if (scoreCard.getSmallStraight() != -1) {
            System.out.println("Small Straight: " + scoreCard.getSmallStraight());
        } else {
            System.out.println("Small Straight Could Be:" + scoreCard.getPotentialSmallStraight());
        }
        if (scoreCard.getLargeStraight() != -1) {
            System.out.println("Large Straight: " + scoreCard.getLargeStraight());
        } else {
            System.out.println("Large Straight Could Be:" + scoreCard.getPotentialLargeStraight());
        }
        if (scoreCard.getYhatzee() != -1) {
            System.out.println("Yhatzee: " + scoreCard.getYhatzee());
        } else {
            System.out.println("Yhatzee Could Be:" + scoreCard.getPotentialYhatzee());
        }
        if (scoreCard.getChance() != -1) {
            System.out.println("Chance: " + scoreCard.getChance());
        } else {
            System.out.println("Chance Could Be:" + scoreCard.getPotentialChance());
        }

    }

}
