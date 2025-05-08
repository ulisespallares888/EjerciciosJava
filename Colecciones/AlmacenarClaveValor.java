package Colecciones;

import POO.Persona;
import java.util.HashMap;
import java.util.List;


public class AlmacenarClaveValor {

    public static HashMap<String, Integer> guardarNombreYEdad(List<Persona> listaDepPersonas){

        HashMap<String,Integer> mapaDePersonas = new HashMap<>();

        for (Persona persona: listaDepPersonas){
            mapaDePersonas.put(persona.getNombre(),persona.getEdad());
        }

        return mapaDePersonas;
    }



}
