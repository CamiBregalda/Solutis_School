/*Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .*/

package Exercises;

import Utils.Header;

public class Exercicio_12 {
    public static void run() {
        Header.print(12);

        for (int i = 1; i <= 100; i++){

            //Múltiplos de 3
            if (i % 3 == 0){

                //Divisão dos múltiplos de 3 por 2
                double resultado = i / 2.00;
                System.out.printf("%d / 2 = %.2f\n", i, resultado);
            }
        }
    }
}
