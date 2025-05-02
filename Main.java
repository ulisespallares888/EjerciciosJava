import Collections.BuscarEnLista;
import Collections.InicializarLista;
import Collections.Ordenar;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeEdades = new ArrayList<>(List.of(3,4,1,2));
        List<Integer> listaDeEdades2 = new ArrayList<>();


        System.out.println(InicializarLista.conValoresRandom(listaDeEdades2,4));
        System.out.println(InicializarLista.conValoresOrdenadosAsc(listaDeEdades2,4));



    }
}
