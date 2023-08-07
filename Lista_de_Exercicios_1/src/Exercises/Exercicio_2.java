/*Faça um programa que receba 2 valores e retorne o maior entre eles.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_2 {

    public static void run() {
        Header.print(2);

        int num1 = InputValue.inputInt("Digite o 1º número: ");
        int num2 = InputValue.inputInt("Digite o 2º número: ");

        int high = higherValue(num1, num2);

        System.out.printf("O maior valor entre %d e %d é %d.\n", num1, num2, high);
    }

    public static int higherValue(int num1, int num2){
        if (num1 >= num2) return num1;
        else return num2;
    }
    
}
