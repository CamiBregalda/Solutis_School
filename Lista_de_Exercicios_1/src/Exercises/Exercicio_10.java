/*Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma cadeia de caracteres.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_10 {
    public static void run() {
        Header.print(10);

        String texto = InputValue.inputString("Digite o texto desejado: ");
        
        int vogais = checarVogais(texto), espacos = checarEspacos(texto), consoantes = checarConsoantes(texto);
        
        System.out.printf("No texto '%s', há %d vogais, %d consoantes e %d espaços em branco.\n", texto, vogais, consoantes, espacos);
    }
    
    public static int checarVogais(String input){
        int cont = 0;
        for (char caracter : input.toCharArray()) {
            if (isVogal(Character.toLowerCase(caracter))) {
                cont++;
            }
        }
        return cont;
    }
    
    public static boolean isVogal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
    
    public static int checarConsoantes(String input){
        int cont = 0;
        for (char caracter : input.toCharArray()) {
            if (Character.isLetter(caracter) && !isVogal(Character.toLowerCase(caracter))) {
                cont++;
            }
        }
        return cont;
    }
        
    public static int checarEspacos(String texto) {
        int cont = 0;
        for (char caracter : texto.toCharArray()) {
            if (Character.isWhitespace(caracter)) {
                cont++;
            }
        }
        return cont;
    }
}
