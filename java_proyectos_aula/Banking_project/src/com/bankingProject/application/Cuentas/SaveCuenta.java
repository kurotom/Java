package com.bankingProject.application.Cuentas;


import java.util.ArrayList;



public class SaveCuenta {
	
	public int indice = 0;

	public ArrayList<Cuenta> arrayCuenta= new ArrayList<Cuenta>();
	
	
	public SaveCuenta() {
//		ArrayList<Cuenta> arrayCuenta= new ArrayList<Cuenta>();
		
	}
	
	
	public int getIndex(Object objeto) {
		return this.arrayCuenta.indexOf(objeto);
	}
	
	public void getCantidad() {
		System.out.println(this.arrayCuenta.size());
	}
	
	public void save(Cuenta objeto) {
		int index = this.arrayCuenta.indexOf(objeto);
		if (index >= 0) {
			System.out.println("Existe: " + this.arrayCuenta.get(index));
		} else {
			this.arrayCuenta.add(objeto);
		}
		
	}
	
	public Object getCuenta(int index) {
		return this.arrayCuenta.get(index);
	}
	
	public Object getAllCuentas() {
		return this.arrayCuenta;
	}
	
	
	
}
