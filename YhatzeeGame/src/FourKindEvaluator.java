import java.util.ArrayList;

public class FourKindEvaluator {

    public FourKindEvaluator() {

    }

    int evaluate(ArrayList<Dice> dice) {
        int count = 0;
        boolean fourFound = false;
        for (int i = 0; i < dice.size(); i++) {
            for (int j = 0; j < dice.size(); j++) {
                if (dice.get(i).getCurrentValue() == dice.get(j).getCurrentValue()) {
                    count++;
                }
            }
            if (count >= 4) {
                fourFound = true;
                break;
            } else {
                count = 0;
            }
        }
        if (fourFound) {
            int total = 0;
            for (int k = 0; k < dice.size(); k++) {
                total = dice.get(k).getCurrentValue();
            }
            return total;
        } else {
            return 0;
        }

    }
}