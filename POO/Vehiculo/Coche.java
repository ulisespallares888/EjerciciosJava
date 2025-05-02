package POO.Vehiculo;

public class Coche implements IVeiculo{
    private Short rudedas;
    private Short puertas;
    private String estado;



    public void Arrancar(){
        this.estado = "Arrancando";
        System.out.println("El coche esta arrancando");
    }

    public void Acelerar(){
        this.estado = "Acelerado";
        System.out.println("El coche esta acelernado");
    }

    public void Frenar(){
        this.estado = "Freanado";
        System.out.println("El coche esta frenado");
    }

    @Override
    public void Apagar() {
        System.out.println("Coche apagado");
    }

    @Override
    public void Encender() {
        System.out.println("Coche encendido");
    }
}
