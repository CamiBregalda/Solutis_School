public class RainhaEMonge {
    public static void main(String[] args) {
        long[][] matriz = new long[8][8];
        long totalGraos = 1;
        long somaGraos = 0;
        int overflowInt = 0;
        long overflowLong = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {

                if (totalGraos > Integer.MAX_VALUE && overflowInt == 0) {
                    overflowInt = i * 8 + j + 1;
                }
                if (totalGraos < 0) {
                    overflowLong = i * 8 + j + 1;
                    break;
                }

                somaGraos += totalGraos;
                totalGraos *= 2;
            }
        }

        System.out.println("Casa final onde os grãos são calculados: " + (overflowLong - 1));
        System.out.println("Total de grãos calculados: " + somaGraos);
        System.out.println("Overflow int: " + overflowInt);
        System.out.println("Overflow long: " + overflowLong);
    }

    private static void overflowLong(){

    }
}