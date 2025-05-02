package POO;

public class Estudiante extends Persona {

    private int nroLegajo;

    public Estudiante(String nombre, String apellido, int nroLegajo){
        super.setApellido(apellido);
        super.setNombre(nombre);
        this.nroLegajo = nroLegajo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + super.getNombre() + '\'' +
                ", Apellido='" + super.getApellido() + '\'' +
                ", nroLegajo=" + nroLegajo +
                '}';
    }
}
