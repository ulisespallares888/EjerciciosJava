package POO;

public class Banco {
    public static void EjecutarTransaccion( Transaccion transaccion){
        Boolean isCorecta = transaccion.getAcredita().setDevitar(transaccion.getMonto());
        if (isCorecta){
            transaccion.getDebita().setAcreditar(transaccion.getMonto());
        }
        else {
            System.out.println("Transacción no realizada por falta de fondos");
        }

    }
}
