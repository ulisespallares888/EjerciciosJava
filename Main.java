import Collections.AlmacenarClaveValor;
import Collections.BuscarEnLista;
import Collections.InicializarLista;
import Collections.Ordenar;
import POO.Persona;
import SintaxisBasicaDeJava.RequestHttp;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<Integer> listaDeEdades = new ArrayList<>(List.of(3,4,1,2));
        List<Persona> listaPersonas = new ArrayList<>( );

        listaPersonas.add(new Persona("Ulises",28));
        listaPersonas.add(new Persona("Pablo",30));
        listaPersonas.add(new Persona("Pallarés",29));

        HashMap<String, Integer> hashMapOutPut = AlmacenarClaveValor.guardarNombreYEdad(listaPersonas);

        for(Map.Entry<String,Integer> entry: hashMapOutPut.entrySet()){
            System.out.println(entry.toString());
        }


    }
}
