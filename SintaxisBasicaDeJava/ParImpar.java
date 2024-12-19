package SintaxisBasicaDeJava;

public class ParImpar {

    public static boolean esPar(int valor){
        if (valor % 2 == 0){
            return true;
        }
        return false;
    }
    public static boolean verificarParidad(){
        int valor = MyScanner.scannearInt();
        return esPar(valor);
    }
}
