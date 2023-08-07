/*Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas, converte-a para quilômetros e apresenta o resultado no console. 
(fórmula de conversão: 1 milha = 1.609 km).*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_4 {
    public static void run(){
        Header.print(4);

        double milha = InputValue.inputDouble("Digite o valor da distância em milhas: ");
        
        System.out.printf("%.2f milhas equivale a %.2f quilômetros.\n", milha, convertMilestoKm(milha));
    }

    public static double convertMilestoKm(double miles){
        return miles * 1609;
    }
}
