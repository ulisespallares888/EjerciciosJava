package SintaxisBasicaDeJava;

public class Bisiesto {
    public boolean isBisiesto(int anio){
        if (anio % 4 == 0){
            return true;
        }
        if (anio % 100 == 0){
            return (anio % 400 == 0);
        }
        return false;
    }
}
