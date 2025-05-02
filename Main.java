
import POO.animales.Gato;
import POO.animales.Perro;
import POO.banco.Banco;
import POO.banco.CuentaBancaria;
import POO.banco.Transaccion;


public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();

        perro.hacerRuido();
        gato.hacerRuido();


    }
}
