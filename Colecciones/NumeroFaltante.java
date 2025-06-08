package Colecciones;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumeroFaltante {


    static public Integer valorFaltante(List<Integer> listaDeNumeros, Integer longitud){

        Set<Integer> setDeNumeros = new HashSet<>(listaDeNumeros);

        for (int i = 0; i < longitud + 1; i++) {
            if (!setDeNumeros.contains(i)) {
                return i;
            }
        }
        return null;
    }
}
