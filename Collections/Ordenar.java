package Collections;

import java.util.List;
import java.util.stream.Collectors;

public class Ordenar {
    public static List OrdenarListaAsc(List lista){
        return lista.stream()
                 .sorted()
                 .toList();
    }
}
