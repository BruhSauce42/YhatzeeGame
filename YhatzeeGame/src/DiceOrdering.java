import java.util.ArrayList;

public class DiceOrdering {
    ArrayList<Dice> toOrder;

    public DiceOrdering() {
    }

    ArrayList<Dice> sort(ArrayList<Dice> toOrder) {
        ArrayList<Dice> result = new ArrayList<>();

        result.add(toOrder.get(0));
        for (int i = 1; i < toOrder.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                if (toOrder.get(i).getCurrentValue() <= result.get(j).getCurrentValue()) {
                    result.add(j, toOrder.get(i));
                    break;
                } else if (j == result.size() - 1) {
                    result.add(toOrder.get(i));
                }
            }

        }
        return result;

    }
}
