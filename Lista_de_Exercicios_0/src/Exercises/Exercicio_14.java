/*Faça um programa que utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles. 
(Pesquise sobre como realizar entrada de dados)*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_14 {
    public static void run() {
        Header.print(14);
        int quant = 50;

        int soma = sumValues(quant);
        
        double media = soma / (float)quant;
        System.out.println("A média dos " + quant + " números digitados é " + media);
    }

    public static int sumValues(int quant){
        int num = 0, soma = 0;

        while (num < quant){
            num++;
            double valor = InputValue.inputDouble("Digite o " + num + "º valor:\n");
            soma += valor;
        }

        return soma;
    }
}
