package Utils;

import java.util.Scanner;

public class InputValue {
    public static int inputInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int input = scanner.nextInt();

        return input;
    }

    public static double inputDouble(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        double input = scanner.nextDouble();

        return input;
    }

    public static String inputString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();

        return input;
    }
}
