package SintaxisBasicaDeJava;
import java.util.Scanner;

public class PseudoCalculadora {
    public static int sumar( int num1, int num2){
        return num1 + num2 ;
    }
    public static int restar( int num1, int num2) { return num1 - num2;}
    public static int multiplicar( int num1, int num2) { return num1 * num2;}
    public static float dividir( int num1, int num2) { return (float) num1 / num2;}
    public static int modulo( int num1, int num2) { return  num1 % num2;}

    public static void calcular(){
        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        scanner.close();

        int suma = sumar(valor1,valor2);
        int resta = restar(valor1,valor2);
        int multiplicacion = multiplicar(valor1,valor2);
        float division = dividir(valor1,valor2);
        int modulo = modulo(valor1,valor2);


        System.out.printf(" suma: %d", suma);
        System.out.printf(" resta: %d", resta);
        System.out.printf(" multiplicacion: %d", multiplicacion);
        System.out.printf(" division: %.2f", division);
        System.out.printf(" modulo: %d", modulo);
    }
}
