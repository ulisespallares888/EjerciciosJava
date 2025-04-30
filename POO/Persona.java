package POO;

import javax.swing.*;

public class Persona {
    private String apellido;
    private String nombre;
    private int dni;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;


    public void Persona(String apellido, String nombre, int dni, int edad, char sexo, double peso, double altura) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void Persona() {
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
