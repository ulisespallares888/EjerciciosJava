package POO.Vehiculo;

public class Camioneta implements IVeiculo{

    public Camioneta(){}

    @Override
    public void Apagar() {
        System.out.println("La camioneta está apagada por ahora");
    }

    @Override
    public void Encender() {
        System.out.println("La camioneta está encendida por ahora");
    }
}
