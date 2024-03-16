package com.bankingProject.application.Funcionario.ClasesAbstractas;


import com.bankingProject.application.Interfaces.SistemaInterno;
import com.bankingProject.application.Utilidades.Autenticacion;


public abstract class LoginFuncionario


extends Funcionario implements SistemaInterno {
    protected Autenticacion auth = new Autenticacion();

    @Override
    public abstract boolean setClave(String var1);

    @Override
    public abstract boolean login(String var1);
}