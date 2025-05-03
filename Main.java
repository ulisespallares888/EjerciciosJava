import Collections.DuplicadosEnHashSet;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeEdades = new ArrayList<>(List.of(3,4,3,5,6,3,2,1,1,6,2));

        System.out.println(DuplicadosEnHashSet.Duplicados(listaDeEdades));

    }
}
