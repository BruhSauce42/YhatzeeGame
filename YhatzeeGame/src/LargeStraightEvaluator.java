import java.util.ArrayList;

public class LargeStraightEvaluator {
    public LargeStraightEvaluator() {

    }

    boolean evaluate(ArrayList<Dice> dice) {
        if (dice.get(0).getCurrentValue() < dice.get(1).getCurrentValue()) {
            if (dice.get(1).getCurrentValue() < dice.get(2).getCurrentValue()) {
                if (dice.get(2).getCurrentValue() < dice.get(3).getCurrentValue()) {
                    if (dice.get(3).getCurrentValue() < dice.get(4).getCurrentValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
