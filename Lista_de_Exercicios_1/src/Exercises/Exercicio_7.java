/*Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double.*/

package Exercises;

import Utils.Header;

public class Exercicio_7 {
    public static void run() {
        Header.print(7);

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.printf("%d / 2 = %.2f\n", i, i/2.0);
            }
        }
    }
}
