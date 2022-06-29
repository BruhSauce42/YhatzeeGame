import java.util.Random;

public class Dice {
    int sides;
    int currentValue;
    boolean saved;
    static Random diceBehavior = new Random();

    public Dice(int sides) {
        this.sides = sides;
        currentValue = 0;
        saved = false;
    }

    void rollDie() {
        if (!saved) {
        }
        currentValue = diceBehavior.nextInt(sides) + 1;
    }

    }

    int getCurrentValue() {
        return currentValue;
    }

    int getSides() {
        return sides;
    }

    void put_in_cup() {
        saved = false;
    }

    void hold() {
        saved = true;
    }

    boolean getSaved() {
        return saved;
    }

}
