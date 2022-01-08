package generator;

import java.util.ArrayList;
import java.util.List;

public class GeneratePossiblesNumbers {

    public static List<Integer> generateNumbersPossibles() {
        List<Integer> possibleNumbers = new ArrayList<>();
        incrementPossibleNumbers(possibleNumbers);
        return possibleNumbers;
    }

    private static void incrementPossibleNumbers(List<Integer> possibleNumbers) {
        for (int i = 1; i <= 25; i++) {
            possibleNumbers.add(i);
        }

    }

}
