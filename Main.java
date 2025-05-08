import Colecciones.NumeroFaltante;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeEdades = new ArrayList<>(List.of(3,4,3,5,6,3,2,1,1,6,2));
        LinkedList<String> cola = new LinkedList<>(
                Arrays.asList("ulises","pablo","juan","matias","tobias","carlos")
        );
        List<Integer> lista = Arrays.asList(4,6,3,8,9,10,2,1,5,0);
        Integer longitud = 10;

        System.out.println("Valor faltante " + NumeroFaltante.valorFaltante(lista,longitud));
    }
}
