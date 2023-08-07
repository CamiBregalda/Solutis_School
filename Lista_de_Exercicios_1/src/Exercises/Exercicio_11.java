/*Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em ordem alfabética (utilize o método compareTo da classe String),. 
Informe também, qual das palavras tem o maior número de caracteres.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_11 {
    public static void run() {
        Header.print(11);

        String palavra = InputValue.inputString("Digite a 1ª palavra: ");
        String palavra2 = InputValue.inputString("Digite a 2ª palavra: ");

        System.out.println("Ordenação em ordem alfabética: ");
        sortAlphabeticalOrder(palavra, palavra2);

        System.out.println("\nOrdenação por tamanho: ");
        sortWordSize(palavra, palavra2);
    }

    public static void sortAlphabeticalOrder(String palavra, String palavra2){
        if (palavra.compareTo(palavra2) < 0){
            System.out.printf("%s, %s\n", palavra, palavra2);
        } else if (palavra.compareTo(palavra2) > 0) {
            System.out.printf("%s, %s\n", palavra2, palavra);
        } else {
            System.out.printf("%s e %s possuem o mesmo valor lexicograficamente.\n", palavra, palavra2);
        }
    }

    public static void sortWordSize(String palavra, String palavra2){
        char[] arrayPalavra = palavra.toCharArray();
        char[] arrayPalavra2 = palavra2.toCharArray();

        if (arrayPalavra.length > arrayPalavra2.length){
            System.out.printf("A palavra %s tem mais caracteres que a palavra %s.\n", palavra, palavra2);
        } else if (arrayPalavra.length < arrayPalavra2.length){
            System.out.printf("A palavra %s tem mais caracteres que a palavra %s.\n", palavra2, palavra);
        } else {
            System.out.printf("A palavra %s tem o mesmo número de caracteres que a palavra %s.\n", palavra, palavra2);
        }
    }
}
