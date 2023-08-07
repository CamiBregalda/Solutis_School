/*Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou vários tanques cheios de gasolina registrando 
a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como 
entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio. O programa deve calcular e exibir o 
consumo em quilômetros/litro para cada tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos até esse ponto. 
Todos os cálculos de média devem produzir resultados de ponto flutuante.*/

package Exercises;

import Utils.Header;
import Utils.InputValue;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_12 {

    public static void run() {
        Header.print(12);

        boolean isContinue = true;
        int opcao, quilometragem, combustivel, quilometragemTotal = 0, combustivelTotal = 0;
        List<ArrayList<Integer>> infoTanques = new ArrayList<>();
        
        while (isContinue){
            System.out.println("--------- Menu ---------");
            System.out.println("[1] - Cadastrar novo tanque de gasolina");
            System.out.println("[2] - Ver tanques cadastrados");
            System.out.println("[0] - Sair");
            System.out.println("Digite a opção escolhida: ");
            opcao = InputValue.inputInt("");

            switch(opcao){
                case 1: {
                    quilometragem = InputValue.inputInt("Qual a quilometragem dirigida? ");
                    quilometragemTotal += quilometragem;

                    combustivel = InputValue.inputInt("Qual a quantidade de combustível em litros utilizada? ");
                    combustivelTotal += combustivel;

                    ArrayList<Integer> infoTanque = new ArrayList<>(List.of(quilometragem, combustivel));
                    infoTanques.add(infoTanque);


                    System.out.printf("O consumo em quilômetros/litro desse tanque foi de %.2fkm/l.\n", quilometragem/(float)combustivel);
                    System.out.println("\nQuilometragem total andada (juntando todos os tanques): " + quilometragemTotal);
                    System.out.println("Combustível total utilizado (juntando todos os tanques): " + combustivelTotal);
                    break;
                }
                case 2:{
                    System.out.println("Tanques cadastrados: ");
                    if(!infoTanques.isEmpty()) {
                        for (int i = 0; i < infoTanques.size(); i++) {
                            ArrayList<Integer> tanque = infoTanques.get(i);
                            double consumo = (float) tanque.get(0) / tanque.get(1);

                            System.out.println("\n---- Tanque " + (i + 1) + " ----");
                            System.out.println("Quilômetros andados: " + tanque.get(0));
                            System.out.println("Combustível utilizado:: " + tanque.get(1));
                            System.out.printf("Consumo: %.2f km/l\n", consumo);
                        }
                    } else {
                        System.out.println("Ação inválida! Você não tem tanques cadastrados!");
                    }
                    break;
                }
                case 0: {
                    isContinue = false;
                    break;
                }
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        }

        System.out.println("\nQuilometragem total andada: " + quilometragemTotal);
        System.out.println("Combustível total utilizado: " + combustivelTotal);
        System.out.printf("Média final de consumo de quilômetros/litro de todos os tanques de gasolina registrados: %.2f.\n", quilometragemTotal/(float)combustivelTotal);
    }
}
