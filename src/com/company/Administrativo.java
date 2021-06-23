package com.company;




public class Administrativo extends Persona implements PersonaInterface{

    public Administrativo(String nombre, String cargo, Double salario) {
        super(nombre, cargo, salario);
    }

    public Administrativo() {
    }
}
