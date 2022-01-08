package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static lotofacil.items.GenerateGame.generateGame;

public class LotofacilGenerator {

    public static void main(String args[]) {
        List<List<Integer>> comboGames = new ArrayList<>();
        List<Integer> firstNumber = generateGame();

        comboGames.add(firstNumber);

        generateAnothersGames(firstNumber, comboGames);
        System.out.println();

        comboGames.forEach(System.out::println);

        System.out.println();
        System.out.println("Total de jogos: " +comboGames.size());

    }

    private static void generateAnothersGames(List<Integer> firstNumber, List<List<Integer>> comboGames) {
        int countGame = 0;

        while (countGame <= 10) {
            List<Integer> anotherGame = generateGame();
            if (validateGameWithFirstAndList(firstNumber, comboGames, anotherGame)) {
                comboGames.add(anotherGame);
                countGame++;
            }
        }
    }

    private static boolean validateGameWithFirstAndList(List<Integer> firstNumber, List<List<Integer>> comboGames,
                                                        List<Integer> anotherGame) {
        return !anotherGame.equals(firstNumber) && !comboGames.contains(anotherGame) && validate11NumbersEquals(firstNumber, anotherGame);
    }

    private static boolean validate11NumbersEquals(List<Integer> firstNumber, List<Integer> anotherGame) {
        AtomicInteger count = new AtomicInteger();
        firstNumber.forEach(number -> {
            if (anotherGame.contains(number)) {
                count.getAndIncrement();
            }
        });

        return count.intValue() >= 12;
    }


}
