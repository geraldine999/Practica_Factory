package com.company;

import static com.company.TiposDeEmpleado.DIRECTIVO;
import static com.company.TiposDeEmpleado.DOCENTE;

public abstract class PersonaFactory {

    public static PersonaInterface construirPersona(TiposDeEmpleado tipoDeEmpleado){
        switch (tipoDeEmpleado){
            case DOCENTE -> {return new Docente();}
            case DIRECTIVO -> {return new Directivo();}
            case ADMINISTRATIVO -> {return new Administrativo();}
            case JEFE_DE_DEPARTAMENTO -> {return new JefeDeDepartamento();}
            default -> {return null;}
        }
    }

    public static PersonaInterface construirPersona(TiposDeEmpleado tipoDeEmpleado, String nombre, String cargo, Double salario){
        PersonaInterface personaInterface = switch (tipoDeEmpleado) {
            case DOCENTE -> new Docente();
            case DIRECTIVO -> new Directivo();
            case ADMINISTRATIVO -> new Administrativo();
            case JEFE_DE_DEPARTAMENTO -> new JefeDeDepartamento();
            default -> null;
        };
        personaInterface.actualizarDatos(nombre, cargo, salario);
        return personaInterface;
    }

}
