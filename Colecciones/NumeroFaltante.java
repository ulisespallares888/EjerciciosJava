package Colecciones;

import java.util.List;

public class NumeroFaltante {


    static public Integer valorFaltante(List<Integer> listaDeNumeros, Integer longitud){

        List<Integer> listaDeNumerosOrdenada = listaDeNumeros.stream().sorted().toList();

        Integer valor = null;
        for (int i = 0; i < longitud; i++) {
            if (!listaDeNumerosOrdenada.get(i).equals(i)) {
                valor = i;
                break;
            }

        }
        return valor;
    }
}
