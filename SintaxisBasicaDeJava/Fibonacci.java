package SintaxisBasicaDeJava;

public class Fibonacci {
    public static int fibonacciDeUnValor(int valor){

        if (valor > 1){
            int primerValor=1;
            int segundoValor=1;
            int fibonacci = 0;
            for(int i = 2; i<=valor; i++){
                fibonacci = primerValor + segundoValor;
                primerValor = segundoValor;
                segundoValor = fibonacci;

            }
            return fibonacci;
        }
        return 1;
    }
}
