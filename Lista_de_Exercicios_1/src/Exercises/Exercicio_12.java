/*Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou vários tanques cheios de gasolina registrando 
a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como 
entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa deve calcular e exibir o 
consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto. 
Todos os cálculos de média devem produzir resultados de ponto flutuante.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

public class Exercicio_12 {

    public static void run() {
        Header.print(12);

        int opcao, quilometragem, combustivel, quilometragemTotal = 0, combustivelTotal = 0;
        
        do {
            quilometragem = InputValue.inputInt("Qual a quilometragem dirigida? ");
            quilometragemTotal += quilometragem;

            combustivel = InputValue.inputInt("Qual a quantidade de combustível em litros utilizada? ");
            combustivelTotal += combustivel;
            
            System.out.printf("\nO consumo em quilômetros/litro desse tanque foi de %.2f.\n", quilometragem/(float)combustivel);
            System.out.println("Até o momento, a quilometragem total andada foi de " + quilometragemTotal + " e a soma total de litros de combustível consumida foi de " + combustivelTotal + ".\n");

            opcao = InputValue.inputInt("Deseja acrescentar mais um monitoramento? (1 - sim | 2 - não)\n");
        } while(opcao == 1);

        System.out.printf("Média final de consumo de quilômetros/litro de todos os tanques de gasolina registrados: %.2f.\n", quilometragemTotal/(float)combustivelTotal);
    }
}
