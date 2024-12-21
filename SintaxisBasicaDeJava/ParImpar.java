package SintaxisBasicaDeJava;

public class ParImpar {

    public static boolean esPar(int valor){
        return valor % 2 == 0;
    }
    public static void esParInput(){
        int valor = MyScanner.scannearInt();
        System.out.println(esPar(valor));
    }
}
