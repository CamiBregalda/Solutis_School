/*Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha o valor de 6, a segunda o valor 4 e a terceira receba o valor da divisão da
primeira pela segunda. Exiba o valor da terceira variável. Faça uma análise do resultado.*/

package Exercises;

import Utils.Header;

public class Exercicio_10 {
    public static void run() {
        Header.print(10);

        int num1 = 6, num2 = 4, num3 = num1 / num2;
        
        System.out.printf("O resultado da divisão de %d por %d é %d.\n", num1, num2, num3);
    }

    /*Pelo enunciado passar uma divisão com valores inteiros, o valor da divisão de 6 por 4 terá apenas sua parte inteira. Para ter uma divisão
    * mais precisa seria necessário realizar o cast com o número divisor (que seria o num2) para que assim o resultado pudesse ser um número de
    * ponto flutuante*/
}
