/*Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.*/

package Exercises;

import Utils.Header;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_13 {
    public static void run() {
        Header.print(13);

        List<List<Number>> possibilities = combination();
        System.out.println("Total de possibilidades de a soma dos dois dados for 7: " + possibilities.size());
        System.out.println("\nPossibilidades:");
        for (List<Number> possibility : possibilities) {
            System.out.println("Dado 1: " + possibility.get(0).intValue() + ", Dado 2: " + possibility.get(1).intValue());
        }
    }

    public static List<List<Number>> combination(){
        List<List<Number>> possibilities = new ArrayList<>();

        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {

                    List<java.lang.Number> given = new ArrayList<>();
                    given.add(dado1);
                    given.add(dado2);

                    possibilities.add(given);
                }
            }
        }

        return possibilities;
    }
}
