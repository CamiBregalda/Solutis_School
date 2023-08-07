/*Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 , 
Terça corresponde a 2, e assim por diante. Utilizando Array.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_5 {
    public static void run() {
        Header.print(5);
        String[] semana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};

        int num = InputValue.inputInt("Digite o número desejado: ");
        if (num > 7 || num < 1) {
            System.out.println("Número inválido!");
        } else {
            System.out.println("O dia " + num + " correspodente a " + semana[num - 1] + ".");
        }
    }
}
