package com.company;

public class Docente extends Persona implements PersonaInterface{

    public Docente(String nombre, String cargo, Double salario) {
        super(nombre, cargo, salario);
    }

    public Docente() {
    }
}
