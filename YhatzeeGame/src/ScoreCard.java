import java.util.ArrayList;

public class ScoreCard {
    int ones = -1;
    int twos = -1;
    int threes = -1;
    int fours = -1;
    int fives = -1;
    int sixes = -1;
    int threeKind = -1;
    int fourKind = -1;
    int fullHouse = -1;
    int smallStraight = -1;
    int largeStraight = -1;
    int Yhatzee = -1;
    int chance = -1;
    int potentialOnes = 0;
    int potentialTwos = 0;
    int potentialThrees = 0;
    int potentialFours = 0;
    int potentialFives = 0;
    int potentialSixes = 0;
    int potentialThreeKind = 0;
    int potentialFourKind = 0;
    int potentialFullHouse = 0;
    int potentialSmallStraight = 0;
    int potentialLargeStraight = 0;
    int potentialYhatzee = 0;
    int potentialChance = 0;
    ArrayList<Dice> saved;
    int round;
    NumberEvaluator oneEval;
    NumberEvaluator twoEval;
    NumberEvaluator threeEval;
    NumberEvaluator fourEval;
    NumberEvaluator fiveEval;
    NumberEvaluator sixEval;
    YhatzeeEvaluator yhatzeeEval;
    ThreeKindEvaluator threevaluator;
    FourKindEvaluator fourvaluator;
    FullHouseEvaluator fullvaluator;
    SmallStraightEvaluator smallvaluator;
    LargeStraightEvaluator largevaluator;
    DiceOrdering sorter;

    public ScoreCard() { // -1 means no value at the moment
        oneEval = new NumberEvaluator(1);
        twoEval = new NumberEvaluator(2);
        threeEval = new NumberEvaluator(3);
        fourEval = new NumberEvaluator(4);
        fiveEval = new NumberEvaluator(5);
        sixEval = new NumberEvaluator(6);
        yhatzeeEval = new YhatzeeEvaluator();
        threevaluator = new ThreeKindEvaluator();
        fourvaluator = new FourKindEvaluator();
        fullvaluator = new FullHouseEvaluator();
        smallvaluator = new SmallStraightEvaluator();
        largevaluator = new LargeStraightEvaluator();
        sorter = new DiceOrdering();
    }

    void updateTable(ArrayList<Dice> data) {
        saved = data;
    }

    void updatePotentials() {
        checkOnes();
        checkTwos();
        checkThrees();
        checkFours();
        checkFives();
        checkSixes();
        checkThreeKind();
        checkFourKind();
        checkFullHouse();
        checkSmallStraight();
        checkLargeStraight();
        checkYhatzee();
        checkTwos();
    }

    void checkOnes() {
        if (ones == -1) {
            potentialOnes = oneEval.evaluate(saved);
        }
    }

    void checkTwos() {
        if (twos == -1) {
            potentialTwos = twoEval.evaluate(saved);
        }
    }

    void checkThrees() {
        if (threes == -1) {
            potentialThrees = threeEval.evaluate(saved);
        }
    }

    void checkFours() {
        if (fours == -1) {
            potentialFours = fourEval.evaluate(saved);
        }
    }

    void checkFives() {
        if (fives == -1) {
            potentialFives = fiveEval.evaluate(saved);
        }
    }

    void checkSixes() {
        if (sixes == -1) {
            potentialSixes = sixEval.evaluate(saved);
        }
    }

    void checkThreeKind() {
        saved = sorter.sort(saved);
        if (threeKind == -1) {
            potentialThreeKind = threevaluator.evaluate(saved);
        }
    }

    void checkFourKind() {
        saved = sorter.sort(saved);
        if (fourKind == -1) {
            potentialFourKind = fourvaluator.evaluate(saved);
        }
    }

    void checkFullHouse() {
        saved = sorter.sort(saved);
        if (fullHouse == -1) {
            if (fullvaluator.evaluate(saved)) {
                potentialFullHouse = 25;
            } else {
                potentialFullHouse = 0;
            }
        }
    }

    void checkSmallStraight() {
        saved = sorter.sort(saved);
        if (smallStraight == -1) {
            if (smallvaluator.evaluate(saved)) {
                potentialSmallStraight = 35;
            } else {
                potentialSmallStraight = 0;
            }
        }
    }

    void checkLargeStraight() {
        saved = sorter.sort(saved);
        if (largeStraight == -1) {
            if (largevaluator.evaluate(saved)) {
                potentialLargeStraight = 45;
            } else {
                potentialLargeStraight = 0;
            }
        }
    }

    void checkYhatzee() {
        if (Yhatzee == -1) {
            if (yhatzeeEval.evaluate(saved) == true) {
                potentialYhatzee = 50;
            } else {
                potentialYhatzee = 0;
            }
        }
    }

    void checkChance() {
        if (chance != -1) {
            int total = 0;
            for (int i = 0; i < saved.size(); i++) {
                total += saved.get(i).getCurrentValue();
            }
            potentialChance = total;
        }
    }

    void takeOnes() {
        ones = potentialOnes;
    }

    void takeTwoes() {
        twos = potentialTwos;
    }

    void takeThrees() {
        threes = potentialThrees;
    }

    void takeFours() {
        fours = potentialFours;
    }

    void takeFives() {
        fives = potentialFives;
    }

    void takeSixes() {
        sixes = potentialSixes;
    }

    void takeThreeKind() {
        threeKind = potentialThreeKind;
    }

    void takeFourKind() {
        fourKind = potentialFourKind;
    }

    void takeFullHouse() {
        fullHouse = potentialFullHouse;
    }

    void takeSmallStraight() {
        smallStraight = potentialSmallStraight;
    }

    void takeLargeStraight() {
        largeStraight = potentialLargeStraight;
    }

    void takeYahtzee() {
        Yhatzee = potentialYhatzee;
    }

    void takeChance() {
        chance = potentialChance;
    }

    int getOnes() {
        return ones;
    }

    int getTwos() {
        return twos;
    }

    int getThrees() {
        return threes;
    }

    int getFours() {
        return fours;
    }

    int getFives() {
        return fives;
    }

    int getSixes() {
        return sixes;
    }

    int getThreeKind() {
        return threeKind;
    }

    int getFourKind() {
        return fourKind;
    }

    int getFullHouse() {
        return fullHouse;
    }

    int getSmallStraight() {
        return smallStraight;
    }

    int getLargeStraight() {
        return largeStraight;
    }

    int getYhatzee() {
        return Yhatzee;
    }

    int getChance() {
        return chance;
    }

}
