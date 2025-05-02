package POO.Vehiculo;

public class Suv implements IVeiculo{

    public Suv(){}

    @Override
    public void Apagar() {
        System.out.println("Suv apagado");
    }

    @Override
    public void Encender() {
        System.out.println("Suv encendido");
    }
}
