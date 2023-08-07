/*Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e que a 
variável B passe a possuir o valor da variável A. Apresentar os valores trocados.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;
import java.util.ArrayList;
import java.util.List;

public class Exercicio_7 {
    
    public static void run(){
        Header.print(7);
        
        int a = InputValue.inputInt("Digite o valor de A: ");
        int b = InputValue.inputInt("Digite o valor de B: ");
        
        List<Number> before = new ArrayList<>(List.of(a, b));
        List<Number> after = swap(a, b);
        
        System.out.println("\nAntes, o valor de A era " + before.get(0).intValue() + " e o valor de B era " + before.get(1).intValue() + ".");
        System.out.println("Agora, o valor de A é " + after.get(0).intValue() + " e o valor de B é " + after.get(1).intValue() + ".");
    }
    
    public static List<Number> swap(int a, int b){        
        int aux = a;
        a = b;
        b = aux;
        
        return new ArrayList<>(List.of(a, b));
    }
}
