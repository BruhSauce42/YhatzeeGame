import java.util.ArrayList;

public class NumberEvaluator {
    int count = 0;
    int what;

    public NumberEvaluator(int number) {
        what = number;
    }

    int evaluate(ArrayList<Dice> check) {
        for (int i = 0; i < check.size(); i++) {
            if (check.get(i).getCurrentValue() == what) {
                count++;
            }
        }
        return count * what;
    }
}
