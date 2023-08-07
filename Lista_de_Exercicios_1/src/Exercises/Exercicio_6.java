/*Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.*/

package Exercises;

import Utils.Header;

public class Exercicio_6 {
    public static void run() {
        Header.print(6);
        float mult = 1;
        
        for(int i = 15; i <= 30; i += 2){
            mult *= i;   
        }
        
        System.out.printf("O produto dos números ímpares de 15 a 30 é %.2f.\n", mult);
    }
}
