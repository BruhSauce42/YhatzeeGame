import java.util.ArrayList;

public class Game {
    Dice die_one = new Dice(6);
    Dice die_two = new Dice(6);
    Dice die_three = new Dice(6);
    Dice die_four = new Dice(6);
    Dice die_five = new Dice(6);
    Dice die_six = new Dice(6);
    ArrayList<Dice> table = new ArrayList<Dice>();
    int round = 0;

    public Game() {

    }
}
