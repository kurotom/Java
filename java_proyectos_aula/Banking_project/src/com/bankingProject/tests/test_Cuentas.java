package com.bankingProject.tests;


import com.bankingProject.application.Client.Client;

import com.bankingProject.application.Cuentas.AhorroCuenta;
import com.bankingProject.application.Cuentas.CreditoCuenta;
;



public class test_Cuentas {
	
   public static void main(String[] args) {
      
	  Client cliente1 = new Client("cliente 1", "9876543210", "123-132-123");
      Client cliente2 = new Client("cliente 2", "1300006841", "000-999-000");
      
      
      String clave = "12345";
      System.out.println(cliente1.setClave(clave));
      System.out.println(cliente1.login(clave));
      
      
      AhorroCuenta cuentaAhorroCliente1 = new AhorroCuenta(100.0D, 1, 777, cliente1);
      AhorroCuenta cuentaAhorroCliente2 = new AhorroCuenta(0.0D, 2, 666, cliente2);
      
      CreditoCuenta creditoCuentaCliente1 = new CreditoCuenta(100.0D, 1, 777, cliente1);
      CreditoCuenta creditoCuentaCliente2 = new CreditoCuenta(0.0D, 2, 666, cliente2);
      
      
      System.out.println(cuentaAhorroCliente1);
      System.out.println(cuentaAhorroCliente1.getTitular().getNombre());
      
      System.out.println(creditoCuentaCliente2);
      System.out.println(creditoCuentaCliente2.getTitular().getNombre());
      
      System.out.println(" ");
      
      
      System.out.println(cuentaAhorroCliente1.getSaldo());
      System.out.println(cuentaAhorroCliente1.getTitular().getNombre());
      System.out.println(cuentaAhorroCliente1.getTitular().getTelefono());
      System.out.println(cuentaAhorroCliente1.getTitular().getNumeroDocumento());
      System.out.println(cuentaAhorroCliente1.getTitular().getUID());
      System.out.println(" ");
      
      System.out.println(cuentaAhorroCliente2.getSaldo());
      System.out.println(cuentaAhorroCliente2.getTitular().getNombre());
      System.out.println(cuentaAhorroCliente2.getTitular().getTelefono());
      System.out.println(cuentaAhorroCliente2.getTitular().getNumeroDocumento());
      System.out.println(cuentaAhorroCliente2.getTitular().getUID());
      System.out.println(" ");
      
      System.out.println("inicio transferencia");
      cuentaAhorroCliente1.transferirSaldo(cuentaAhorroCliente2, 40.0D);
      cuentaAhorroCliente1.retirarSaldo(10.0D);
      cuentaAhorroCliente1.consultaComisiones();
      
      
      System.out.println("inicio transferencia");
      creditoCuentaCliente1.transferirSaldo(creditoCuentaCliente2, 40.0D);
      creditoCuentaCliente1.retirarSaldo(10.0D);
      creditoCuentaCliente1.consultaComisiones();
      creditoCuentaCliente2.consultaComisiones();
      
   }
   
}
