
import SintaxisBasicaDeJava.*;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<String> personas = Arrays.asList("Juan", "Pedro", "Maria", "Ana", "Luis", "Carlos", "Jose", "Luisa", "Fernando", "Sofia");

        // Personas ordenadas alfabeticamente
        List<String> personasOrdenadas = personas.stream()
                                                .sorted()
                                                .collect(Collectors.toList());

        System.out.println("Personas ordenadas alfabeticamente");
        personasOrdenadas.forEach(System.out::println);


        // Cantidad  de personas
        Long cantPersonas = personas.stream().count();
        System.out.printf("Cantidad  de personas %d \n",cantPersonas);

        // Personas que comienzan con una letra
        char letra = 'L';

        List<String> personasLetra = personas.stream()
                                            .filter(p -> {

                                                return p.startsWith(String.valueOf(letra));
                                            })
                                            .collect(Collectors.toList());

        System.out.println("Personas que comienzan con una letra L ");
        personasLetra.forEach(System.out::println);



    }
}
