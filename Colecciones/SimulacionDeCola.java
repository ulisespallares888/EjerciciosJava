

/*
🧠 Ejercicio: Simulación de atención al cliente
Enunciado: Simulá una fila de atención al cliente en una oficina pública. Cada persona que llega se encola al final,
y el sistema debe atender a las personas por orden de llegada.
 Implementa un programa que permita:
1.	Agregar una persona a la cola (nombre).
2.	Atender a la siguiente persona (sacarla de la cola y mostrar su nombre).
3.	Mostrar cuántas personas hay esperando.
4.	Ver quién es la próxima persona sin atenderla aún.
5.	Salir del sistema.
Requisitos:
•	Usá una LinkedList<String> para representar la cola.
•	Mostra un pequeño menú en consola para interactuar con las opciones.

 */

package Colecciones;
import java.util.LinkedList;


public class SimulacionDeCola {


    static public void agregarClienteALaCola(LinkedList<String> cola, String  nuevoCliente) {
        cola.add(nuevoCliente);
        cola.forEach(System.out::println);
    }

    static public void atenderCliente(LinkedList<String> cola){
        cola.pollFirst();
        System.out.println();
        cola.forEach(System.out::println);

    }

    static public int cuantosClientesQuedan(LinkedList<String> cola) {
        cola.forEach(System.out::println);

        return cola.size();
    }

    static public String verSiguienteCliente(LinkedList<String> cola) {
        cola.forEach(System.out::println);
        return cola.get(1);
    }



}
