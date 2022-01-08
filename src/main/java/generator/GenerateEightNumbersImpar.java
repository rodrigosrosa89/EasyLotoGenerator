package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static lotofacil.items.GeneratePossiblesNumbers.generateNumbersPossibles;

public class GenerateEightNumbersImpar {

    public static void main(String[] args) {
        List<Integer> impares = generate(generateNumbersPossibles());
    }

    public static List<Integer> generate(List<Integer> possibles) {
        List<Integer> impares = new ArrayList<>();

        while (impares.size() < 8) {
            Random r = new Random();
            int rdm = possibles.get(r.nextInt(possibles.size()));
            if (rdm % 2 != 0 && !impares.contains(rdm)) {
                impares.add(rdm);
            }
        }
        return impares;
    }

}
