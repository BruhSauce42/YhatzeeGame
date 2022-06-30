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

}
