package com.bankingProject.application.Funcionario;

import com.bankingProject.application.Funcionario.ClasesAbstractas.Funcionario;

public class Contador extends Funcionario {
    public Contador(String nombre, double salario, String identificador, String rol) {
        super.setNombre(nombre);
        super.setSalario(salario);
        super.setRol(rol);
        super.setIdentificador(identificador);
    }

    @Override
    public double bonificacion() {
        return 0.0;
    }
}
