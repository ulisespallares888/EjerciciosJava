
import POO.Banco;
import POO.CuentaBancaria;
import POO.Transaccion;
import SintaxisBasicaDeJava.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(1000);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(2000);


        System.out.println(cuentaBancaria1);
        System.out.println(cuentaBancaria2);

        Transaccion transaccion1 = new Transaccion(cuentaBancaria1,cuentaBancaria2,1100);
        System.out.println(transaccion1.toString());
        Banco.EjecutarTransaccion(transaccion1);

        System.out.println(cuentaBancaria1);
        System.out.println(cuentaBancaria2);
    }
}
