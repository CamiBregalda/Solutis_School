/*Refaça o programa anterior utilizando a estrutura do while.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

import java.util.Scanner;

public class Exercicio_15 {
    public static void run() {
        Header.print(15);
        int quant = 50;

        int soma = sumValues(quant);

        double media = soma / (float)quant;
        System.out.println("A média dos " + quant + " números digitados é " + media);
    }

    public static int sumValues(int quant){
        int num = 0, soma = 0;

        do {
            num++;
            double valor = InputValue.inputDouble("Digite o " + num + "º valor:\n");
            soma += valor;
        } while (num < quant);

        return soma;
    }
}
