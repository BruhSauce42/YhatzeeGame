import java.util.ArrayList;

public class ThreeKindEvaluator {

    public ThreeKindEvaluator() {

    }

    int evaluate(ArrayList<Dice> dice) {
        int count = 0;
        boolean threeFound = false;
        for (int i = 0; i < dice.size(); i++) {
            for (int j = 0; j < dice.size(); j++) {
                if (dice.get(i).getCurrentValue() == dice.get(j).getCurrentValue()) {
                    count++;
                }
            }
            if (count >= 3) {
                threeFound = true;
                break;
            } else {
                count = 0;
            }
        }
        if (threeFound) {
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
