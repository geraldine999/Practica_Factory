package com.company;

public abstract class Persona implements PersonaInterface{
    private String nombre;
    private String cargo;
    private Double salario;

    public Persona(String nombre, String cargo, Double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void actualizarDatos(String nombre, String cargo, Double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
}
