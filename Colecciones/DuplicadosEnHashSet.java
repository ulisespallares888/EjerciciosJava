package Colecciones;

import java.util.HashSet;
import java.util.List;

public class DuplicadosEnHashSet {

    public static HashSet<Integer> Duplicados(List<Integer> listaDeValores){

        HashSet<Integer> duplcados = new HashSet<>();
        HashSet<Integer> listaLimpia = new HashSet<>();

        for(Integer valor: listaDeValores){

            if(listaLimpia.contains(valor)){
                duplcados.add(valor);
            }else{
                listaLimpia.add(valor);
            }

        }

        return duplcados ;
    }

}
