package com.bankingProject.application.Cuentas;

import com.bankingProject.application.Client.Client;


public class AhorroCuenta extends Cuenta {
	
   private double comision = 0.05;

   public AhorroCuenta(double salario, int agencia, int numeroCuenta, Client cliente) {
      super(salario, agencia, numeroCuenta, cliente);
   }

   public void retirarSaldo(double cantidad) {
      super.retirarSaldo(cantidad, this.comision);
   }

   public void transferirSaldo(Cuenta cuenta, double cantidad) {
      super.transferirSaldo(cuenta, cantidad, this.comision);
   }
   

   
}
