package SintaxisBasicaDeJava;

import java.util.ArrayList;

public class Factorial {
    public static void factorear(int valor){

        int base, divisor = 2;
        if (valor % 2 == 0){
            base = valor / 2;
        }else {
            base = (valor - 1) / 2;
        }

        while (divisor <= base){
            if (valor % divisor == 0) {
                int potencia = 0;
                while (valor % divisor == 0) {
                    valor = valor / divisor;
                    potencia++;
                }
                System.out.println(divisor+"^"+potencia);
            }
            divisor++;
        }
    }
}
