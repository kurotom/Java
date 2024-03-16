package com.bankingProject.tests;

import com.bankingProject.application.Funcionario.ClasesAbstractas.Funcionario;
import com.bankingProject.application.Funcionario.ClasesAbstractas.LoginFuncionario;

import com.bankingProject.application.Interfaces.SistemaInterno;

import com.bankingProject.application.Funcionario.Administrador;
import com.bankingProject.application.Funcionario.Contador;
import com.bankingProject.application.Funcionario.Gerente;


public class test_funcionarios {
    
	public static void main(String[] args) {
    
		System.out.println("Test Funcinario -> Gerente, Administrador, Contador");
        
		Gerente gerente = new Gerente("gerente", 1000.0, "12345", "gerente");
        Administrador administrador = new Administrador("administrador", 1000.0, "12345", "gerente");
        Contador contador = new Contador("contador", 1000.0, "12345", "gerente");
        
        System.out.println(gerente.getClass());
        System.out.println(gerente instanceof Funcionario);
        System.out.println(gerente instanceof LoginFuncionario);
        System.out.println(gerente instanceof SistemaInterno);
        
        System.out.println(administrador);
        System.out.println(contador);
        
        String passExample = "12345";
        
        System.out.println(gerente.getUID());
        System.out.println(gerente.setClave(passExample));
        System.out.println(gerente.login(passExample));
        
        
        System.out.println(administrador.getUID());
        System.out.println(administrador.setClave(passExample));
        System.out.println(administrador.login(passExample));
        
        
        System.out.println(contador instanceof Funcionario);
        System.out.println(contador.getClass());
        System.out.println(contador instanceof SistemaInterno);
        
     
        
    }
	
}