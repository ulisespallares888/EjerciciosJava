package Colecciones;

import java.util.List;

public class Ordenar {
    public static List OrdenarListaAsc(List lista){
        return lista.stream()
                 .sorted()
                 .toList();
    }
}
