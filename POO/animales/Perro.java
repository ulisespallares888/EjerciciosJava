package POO.animales;

public class Perro extends Animal{
    private String raza;
    private String nombre;

    public Perro(){}


    @Override
    public void hacerRuido(){
        System.out.println("Soy un perro ladrando");
    }
}
