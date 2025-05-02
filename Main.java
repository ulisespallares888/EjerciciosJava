
import POO.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantesArrayList = new ArrayList<>();

        estudiantesArrayList.add(new Estudiante("ulises", "pallares",22692));
        estudiantesArrayList.add(new Estudiante("juan", "Mota",88865));
        estudiantesArrayList.add(new Estudiante("matias", "soto",77898));

        //estudiantesArrayList.forEach(System.out::println);

        List<Estudiante> estConLetraA = estudiantesArrayList.stream()
                .filter(p -> p.getApellido().contains("s")
                            && p.getNombre().contains("s")
                )
                .peek(p-> System.out.println("mostando al estudiante"+p.getNroLegajo()))
                .toList();

        estConLetraA.forEach(System.out::println);
    }
}
