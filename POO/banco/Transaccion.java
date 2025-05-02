package POO.banco;

public class Transaccion {
    private CuentaBancaria Debita;
    private CuentaBancaria Acredita;
    private Integer Monto;

    public Transaccion(){}

    public  Transaccion (CuentaBancaria acredita , CuentaBancaria devita, Integer monto){
        this.Debita = devita;
        this.Acredita = acredita;
        this.Monto = monto;
    }

    public CuentaBancaria getDebita(){

        return this.Debita;
    }

    public CuentaBancaria getAcredita() {
        return this.Acredita;
    }

    public Integer getMonto(){
        return this.Monto;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "Acredita=" + Debita +
                ",Debita =" + Acredita +
                ", Monto=" + Monto +
                '}';
    }
}
