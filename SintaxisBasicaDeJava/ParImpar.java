package SintaxisBasicaDeJava;

public class ParImpar {

    public static boolean esPar(int valor){
        return valor % 2 == 0;
    }
    public static boolean verificarParidad(){
        int valor = MyScanner.scannearInt();
        return esPar(valor);
    }
}
