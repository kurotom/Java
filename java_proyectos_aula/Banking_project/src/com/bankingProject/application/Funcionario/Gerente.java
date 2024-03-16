package com.bankingProject.application.Funcionario;

import com.bankingProject.application.Funcionario.ClasesAbstractas.LoginFuncionario;


public class Gerente extends LoginFuncionario {
	
    public Gerente(String nombre, double salario, String identificador, String rol) {
        super.setNombre(nombre);
        super.setSalario(salario);
        super.setRol(rol);
        super.setIdentificador(identificador);
    }

    @Override
    public double bonificacion() {
        return super.getSalario() * 50.0 / 100.0;
    }

    @Override
    public boolean setClave(String clave) {
        return this.auth.setPassword(clave);
    }

    @Override
    public boolean login(String clave) {
        return this.auth.login(clave);
    }
}