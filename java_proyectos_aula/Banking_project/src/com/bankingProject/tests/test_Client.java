package com.bankingProject.tests;


import com.bankingProject.application.Interfaces.SistemaInterno;
import com.bankingProject.application.Client.Client;


public class test_Client {
   

	public static void main(String[] args) {
		
		Client cliente = new Client("cliente 1", "9876543210", "123-132-123");
		
		System.out.println(cliente);
		System.out.println(cliente.getNombre());
		
		
		String clave = "12345";
      	System.out.println(cliente.setClave(clave));
      	System.out.println(cliente.login(clave));
      	System.out.println(cliente.getUID());

      	
      	System.out.println(cliente instanceof SistemaInterno);
      	System.out.println(cliente instanceof Client);
      	
	}
}