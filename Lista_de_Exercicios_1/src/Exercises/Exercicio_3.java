/*Crie uma classe e na função main() implemente um programa que lê um número inteiro do teclado e imprime todos os números primos menores que ele 
(divisíveis por 1 ou por ele mesmo).*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_3 {
    public static void run() {
        Header.print(3);

        int num = InputValue.inputInt("Digite um número inteiro: ");
        
        for (int i = num; i >= 2; i--){
            if(calcularPrimo(i)){
                if(i == 2){
                    System.out.println(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }
    
    public static boolean calcularPrimo(int num){
        if (num <= 1){
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;        
    }
}
