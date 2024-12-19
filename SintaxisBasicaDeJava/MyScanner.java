package SintaxisBasicaDeJava;

import java.util.Scanner;

public class MyScanner {

    public static int scannearInt(){
        Scanner scannerInt = new Scanner(System.in);
        int valor = scannerInt.nextInt();
        scannerInt.close();
        return valor;
    }
    public static String scannearString(){
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.nextLine();
        scanner.close();
        return valor;
    }
    public static float scannearFoat(){
        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();
        scanner.close();
        return valor;
    }
}
