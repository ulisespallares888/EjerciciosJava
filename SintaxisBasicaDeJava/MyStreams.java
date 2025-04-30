package SintaxisBasicaDeJava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyStreams {

    // Odenar personas alfabeticamente
    public static List<String> ordenarLista(List<String> listaDePersonas) {
        return listaDePersonas.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // Cantidad  de elementos
    public static Long contElementos(List<?> lista) {
        return lista.stream().count();
    }

    // Personas que comienzan con una letra
    public static List<String> personasConLetra(List<String> listaDePersonas, char caracter) {
        return listaDePersonas.stream()
                .filter(p -> {

                    return p.startsWith(String.valueOf(caracter));
                })
                .collect(Collectors.toList());
    }

    // Suma de elementos
    public static Integer sumarElemntos(List<Integer> listaValores){
        return listaValores.stream().reduce(Integer::sum).get();
        //return listaValores.stream().reduce((a,b) -> a+b).get();
    }


    // Sumar las letras de todos los elementos de una lista que contengan una letra
    public static Integer sumarTodasLasLetras(List<String> list, CharSequence letra){
        Predicate<String> sumarLetraDeUnaPalabra = l -> {
            return l.contains(letra);
        };
        return list.stream().filter(sumarLetraDeUnaPalabra).mapToInt(String::length).sum();
    }

}
