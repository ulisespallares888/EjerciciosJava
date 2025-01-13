
import SintaxisBasicaDeJava.*;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<String> personas = Arrays.asList("Juan", "Pedro", "Maria", "Ana", "Luis", "Carlos", "Jose", "Luisa", "Fernando", "Sofia");
        List<Integer> valores = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        System.out.println(MyStreams.ordenarLista(personas));
        System.out.println(MyStreams.personasConLetra(personas,'Z'));
        System.out.println(MyStreams.contElementos(personas));
        System.out.println(MyStreams.contElementos(valores));

        System.out.println(MyStreams.sumarElemntos(valores));


    }
}
