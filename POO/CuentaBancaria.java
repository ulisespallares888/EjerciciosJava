package POO;

public class CuentaBancaria {
    private Integer Dinero;

    public CuentaBancaria(){}

    public CuentaBancaria(Integer dinero) {
        Dinero = dinero;
    }

    public Integer getDinero(){
        return this.Dinero;
    }

    public Boolean setDevitar(int nuevoDinero){
        if (this.Dinero >= nuevoDinero){
            this.Dinero -= nuevoDinero;
            return true;
        }
        return false;

    }

    public void setAcreditar(int nuevoDinero){
        this.Dinero += nuevoDinero;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "Dinero=" + Dinero +
                '}';
    }
}
