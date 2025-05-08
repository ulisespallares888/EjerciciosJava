package Colecciones;

import java.util.List;

public class Edades {
    public static float promedioDeEdades(List<Integer> listaEdades){

        int sumaDeEdades = listaEdades.stream()
                .mapToInt(Integer::intValue)
                .sum();

        return (float) sumaDeEdades / listaEdades.size();
    }
}
