package generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lotofacil.items.GeneratePossiblesNumbers.generateNumbersPossibles;

public class GenerateGame {

    private static GeneratePossiblesNumbers generateNumbersPossibles;
    private static GenerateEightNumbersImpar generateEightNumbersImpar;
    private static GenerateSevenNumberPar generateSevenNumberPar;

    public static List<Integer> generateGame() {
        List<Integer> possibles = generateNumbersPossibles();
        List<Integer> pares = generateSevenNumberPar.generate(possibles);
        List<Integer> impares = generateEightNumbersImpar.generate(possibles);
        List<Integer> sorteio = new ArrayList<>();
        sorteio.addAll(pares);
        sorteio.addAll(impares);
        Collections.sort(sorteio);
        return sorteio;
    }

}
