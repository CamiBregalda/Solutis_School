/*Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a palavra fornecida seja uma palavra que pode ser lida da esquerda pra 
direita ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_8 {
    public static void run() {
        Header.print(8);

        String palavra = InputValue.inputString("Digite a palavra desejada: ");

        //Separar um a um os caracteres da palavra
        String[] caracteres = new String[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] = String.valueOf(palavra.charAt(i));
        }
        
        String palavraTrocada = trocarOrdem(caracteres);

        System.out.println("A palavra " + palavra.toLowerCase() + " ao contrário fica " + palavraTrocada.toLowerCase() + ".");
        if(palavra.equalsIgnoreCase(palavraTrocada)){
            System.out.println("Assim, " + palavra.toLowerCase() + " é a mesma palavra quando lida da esquerda pra direita e da direita pra esquerda.");
        } else {
            System.out.println("Assim, " + palavra.toLowerCase() + " não é a mesma palavra quando lida da esquerda pra direita e da direita pra esquerda.");
        }
    }
    
    public static String trocarOrdem(String[] input){
        StringBuilder novaPalavra = new StringBuilder();
        
        for (int i = input.length - 1; i >= 0; i--) {
            novaPalavra.append(input[i]);
        }
        
        return novaPalavra.toString();
    }
}
