package com.company;

public class Directivo extends Persona implements PersonaInterface{

    public Directivo(String nombre, String cargo, Double salario) {
        super(nombre, cargo, salario);
    }

    public Directivo() {
    }
}
