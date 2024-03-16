package com.bankingProject.application.Funcionario.ClasesAbstractas;

import java.util.UUID;

public abstract class Funcionario {
    private String nombre;
    private double salario;
    private String identificador;
    private String rol;
    private UUID uid = UUID.randomUUID();
    
    
    public String toString() {
    	return new String("Nombre: " + this.nombre + " | Rol: " + this.rol);
    }

    public String getUID() {
        return this.uid.toString();
    }

    public boolean setNombre(String name) {
        if (name != "") {
            this.nombre = name;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean setIdentificador(String id) {
        if (id != "") {
            this.identificador = id;
            return true;
        }
        return false;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public double getSalario() {
        return this.salario;
    }

    public boolean setSalario(double salario) {
        if (salario > 0.0) {
            this.salario = salario;
            return true;
        }
        return false;
    }

    public boolean setRol(String role) {
        if (role != "") {
            this.rol = role;
            return true;
        }
        return false;
    }

    public String getRol() {
        return this.rol;
    }

    public abstract double bonificacion();
}
