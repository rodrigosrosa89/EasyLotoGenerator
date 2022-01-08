package generator;

import java.util.List;
import java.util.Random;

import static generator.GeneratePossiblesNumbers.generateNumbersPossibles;

public class GenerateSevenNumberPar {

    public static void main(String[] args) {
        List<Integer> pares = generate(generateNumbersPossibles());
    }

    public static List<Integer> generate(List<Integer> possibles) {
        List<Integer> pares = new ArrayList<>();

        while (pares.size() < 7) {
            Random r = new Random();
            int rdm = possibles.get(r.nextInt(possibles.size()));
            if (rdm % 2 == 0 && !pares.contains(rdm)) {
                pares.add(rdm);
            }
        }
        return pares;
    }
}
