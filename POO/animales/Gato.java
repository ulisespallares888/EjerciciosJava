package POO.animales;

public class Gato extends Animal{
    private String color;

    public Gato(){}

    @Override
    public void hacerRuido(){
        System.out.println("Soy un gato maullando");
    }

}
