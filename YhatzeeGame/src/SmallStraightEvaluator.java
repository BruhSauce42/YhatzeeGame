import java.util.ArrayList;

public class SmallStraightEvaluator {
    public SmallStraightEvaluator() {

    }

    boolean evaluate(ArrayList<Dice> dice) {
        if (dice.get(0).getCurrentValue() < dice.get(1).getCurrentValue()) {
            if (dice.get(1).getCurrentValue() < dice.get(2).getCurrentValue()) {
                if (dice.get(2).getCurrentValue() < dice.get(3).getCurrentValue()) {
                    return true;
                }
            }
        } else if (dice.get(4).getCurrentValue() < dice.get(4).getCurrentValue()) {
            if (dice.get(1).getCurrentValue() < dice.get(2).getCurrentValue()) {
                if (dice.get(2).getCurrentValue() < dice.get(3).getCurrentValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
