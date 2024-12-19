package SintaxisBasicaDeJava;
import java.util.Scanner;

public class SumarDosNumeros {
    private static int sumar( int num1, int num2){
        return num1 + num2 ;
    }

    public static void manipularValores(){
        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        scanner.close();

        int suma = sumar(valor1,valor2);
        System.out.println(suma);
    }
}
