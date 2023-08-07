/*Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.*/

package Exercises;

import Utils.Header;

public class Exercicio_9 {
    public static void run() {
        Header.print(9);

        for (int i = 0; i <= 10; i++){
            System.out.printf("O quadrado do número %d é %d.\n", i, i * i);
        }
    }
}
