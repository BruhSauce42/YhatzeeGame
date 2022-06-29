import java.util.ArrayList;

public class FullHouseEvaluator {
    public FullHouseEvaluator() {

    }

    boolean evaluate(ArrayList<Dice> dice) {
        if (dice.get(0).getCurrentValue() == dice.get(1).getCurrentValue()
                && dice.get(0).getCurrentValue() == dice.get(2).getCurrentValue()) {
            if (dice.get(3).getCurrentValue() == dice.get(4).getCurrentValue()) {
                return true;
            }
        } else if (dice.get(2).getCurrentValue() == dice.get(3).getCurrentValue()
                && dice.get(2).getCurrentValue() == dice.get(4).getCurrentValue()) {
            if (dice.get(0).getCurrentValue() == dice.get(1).getCurrentValue()) {
                return true;
            }
        }
        return false;
    }
}
