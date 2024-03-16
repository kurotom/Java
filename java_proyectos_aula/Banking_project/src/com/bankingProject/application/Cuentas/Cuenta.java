package com.bankingProject.application.Cuentas;

import com.bankingProject.application.Client.Client;
//import com.bankingProject.application.Cuentas.SaveCuenta;

public abstract class Cuenta {
	
   private double saldo;
   private int agencia;
   private int numeroCuenta;
   private Client titular = new Client();
   private static double comisiones;
   
   public SaveCuenta arrayCuentas = new SaveCuenta();

   public Cuenta(double saldo, int agencia, int numeroCuenta, Client cliente) {
      this.saldo = saldo;
      this.agencia = agencia;
      this.numeroCuenta = numeroCuenta;
      this.titular = cliente;

   }

   @Override
   public boolean equals(Object objeto) {
	   Cuenta cuenta = (Cuenta) objeto;
	   return this.agencia == cuenta.agencia && this.numeroCuenta == cuenta.numeroCuenta;
   }
   
   public String toString() {
	   return new String("Cliente: " + this.titular.getNombre() + " | Agencia: " + this.agencia + " | Cuenta: " + this.numeroCuenta);
   }
   
   public void addComision(double valor) {
      if (valor > 0.0D) {
         comisiones += valor;
      }
   }

   public void consultaComisiones() {
      System.out.println("Comisiones totales: " + comisiones);
   }

   public void setTitular(Client titular) {
      this.titular = titular;
   }

   public Client getTitular() {
      return this.titular;
   }

   public void setNumeroCuenta(int numero) {
      if (numero > 0) {
         this.numeroCuenta = numero;
      }

   }

   public void getNumeroCuenta() {
      System.out.println("Numero Cuenta: " + this.numeroCuenta);
   }

   public void setAgencia(int agencia) {
      if (agencia > 0) {
         this.agencia = agencia;
      }

   }

   public void getAgencia() {
      System.out.println("Agencia: " + this.agencia);
   }

   public void depositarSaldo(double saldo) {
      this.saldo += saldo;
      System.out.println("Saldo actual: " + this.saldo);
   }

   public void setSaldo(double saldo) {
      if (saldo >= 0.0D) {
         this.saldo = saldo;
      }

   }

   public double getSaldo() {
      return this.saldo;
   }

   public double consultarSaldo() {
      return this.saldo;
   }

   public void retirarSaldo(double cantidad, double comision) {
      if (cantidad > 0.0D) {
         if (this.getSaldo() > 0.0D) {
            double costoComision = cantidad * comision;
            double operacion = cantidad + costoComision;
            double saldoActual = this.getSaldo() - operacion;
            if (saldoActual >= 0.0D) {
               this.setSaldo(saldoActual);
               this.addComision(costoComision);
               System.out.println("Retiro: " + cantidad);
            } else {
               System.out.println("Saldo insuficiente");
            }
         } else {
            this.getSaldo();
         }
      } else {
         System.out.println("Monto a transferir debe ser mayor a 0.");
      }

   }

   public void transferirSaldo(Cuenta cuenta, double cantidad, double comision) {
      if (cantidad > 0.0D) {
         if (this.getSaldo() > 0.0D) {
            double costoComision = cantidad * comision;
            double operacion = cantidad + costoComision;
            double saldoActual = this.getSaldo() - operacion;
            if (saldoActual >= 0.0D) {
               this.setSaldo(saldoActual);
               cuenta.depositarSaldo(cantidad);
               this.addComision(costoComision);
               System.out.println("Transferencia --> Cuenta: " + cuenta + " Monto: " + cantidad);
            } else {
               System.out.println("Saldo insuficiente");
            }
         } else {
            this.getSaldo();
         }
      } else {
         System.out.println("Monto a transferir debe ser mayor a 0.");
      }

   }
}
