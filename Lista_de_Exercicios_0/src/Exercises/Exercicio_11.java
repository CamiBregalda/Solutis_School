/*Utilize a estrutura if para fazer um programa que retorne o nome de um produto a partir do código do mesmo. Considere os seguintes códigos:

001 ? Parafuso;
002 ? Porca;
003 ? Prego;

Para qualquer outro código: XXX ? Diversos.
*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_11 {
    public static void run() {
        Header.print(11);

        int cod = InputValue.inputInt("Digite o código do produto: ");
        String product = getProduct(cod);

        System.out.println("O produto selecionado foi: " + product);
    }

    public static String getProduct(int cod){
        if (cod == 1) return "Parafuso";
        else if (cod == 2) return "Porca";
        else if (cod == 3) return "Prego";
        else return "Diversos";
    }
}
