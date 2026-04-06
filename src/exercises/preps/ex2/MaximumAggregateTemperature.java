package exercises.preps.ex2;

import java.util.ArrayList;
import java.util.List;

public class MaximumAggregateTemperature {
    public static long findMaximumChange(List<Integer> temperatureChange) {
        long sSum = 0;
        long pSum = 0;

        for (int i = 0; i < temperatureChange.size(); i++) {
            pSum += temperatureChange.get(i);
        }

        long max = Integer.MIN_VALUE;

        for (int i = 0; i < temperatureChange.size(); i++) {
            max = Math.max(Math.max(pSum, sSum + temperatureChange.get(i)), max);

            pSum -= temperatureChange.get(i);
            sSum += temperatureChange.get(i);
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> tmpChange = new ArrayList<>();
        tmpChange.add(-1);
        tmpChange.add(2);
        tmpChange.add(3);

        findMaximumChange(tmpChange);
    }
}