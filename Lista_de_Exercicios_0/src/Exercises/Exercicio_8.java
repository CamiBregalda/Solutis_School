/*Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_8 {

    public static void run(){
        Header.print(8);

        int num = InputValue.inputInt("Digite um valor inteiro: ");

        System.out.println(num + " é um número " + (isEven(num) ? "par." : "impar."));
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
