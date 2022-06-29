import java.util.ArrayList;

public class YhatzeeEvaluator {
    public YhatzeeEvaluator() {

    }

    boolean evaluate(ArrayList<Dice> check) {
        for (int i = 0; i < check.size(); i++) {
            if (check.get(i) != check.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
