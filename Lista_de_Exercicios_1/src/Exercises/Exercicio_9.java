/*Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o 
resultado terá que ser arredondado.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_9 {
    public static void run() {
        Header.print(9);

        int raio = InputValue.inputInt("Digite o raio do círculo: ");
        
        System.out.printf("A área do círculo é %.2f.\n", Math.PI * Math.pow(raio, 2));
    }
}
