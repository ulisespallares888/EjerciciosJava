package SintaxisBasicaDeJava;

import java.util.ArrayList;

public class Divisores {
    public static void divisores(int valor){
        int base;
        ArrayList<Integer> divisores = new ArrayList<>();
        if (valor % 2 == 0){
            base = valor / 2;
        }else {
            base = (valor + 1) / 2;
        }
        for(int i = 2; i <= base; i++){
            if (valor % i == 0){
                //System.out.println(i);
                divisores.add(i);
            }
        }
        System.out.println(divisores);
    }
}
