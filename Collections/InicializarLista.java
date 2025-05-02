package Collections;

import java.util.List;
import java.util.Random;

public class InicializarLista {

    public static List<Integer> conValoresRandom(List lista, int cantidadDeValores){

        for (int i = 0; i < cantidadDeValores; i++) {
            lista.add(ValorRandom());
        }

        return lista;
    }

    public static List<Integer> conValoresOrdenadosAsc(List lista, int cantidadDeValores){

        for(int i=0; i<=cantidadDeValores; i++){
            lista.add(i);
        }

        return lista;
    }

    private static int ValorRandom() {
        return (int) (Math.random() * 100 + 1);
    }
}
