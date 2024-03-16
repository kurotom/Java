package com.bankingProject.tests;


import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import com.bankingProject.application.Client.Client;
import com.bankingProject.application.Cuentas.Cuenta;
import com.bankingProject.application.Cuentas.AhorroCuenta;
import com.bankingProject.application.Cuentas.CreditoCuenta;
import com.bankingProject.application.Cuentas.SaveCuenta;

public class test_Cuentas_Save {

	public static void main(String[] args) {

//		ArrayList<Integer> lista = new ArrayList<>();
//		List<Integer> lista = new ArrayList<Integer>();	
//		
//		lista.add(5);
//		lista.add(2);
//		lista.add(3);
//		lista.add(1);
//		lista.add(4);
//		System.out.println(lista);
//		
//		Collections.sort(lista, new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				if (o1 == o2) {
//					return 0;
//				} else if (o1 > o2) {
//					return 1;
//				} else {
//					return -1;
//				}
//			}
//		});
		
		
		List<Integer> a = Arrays.asList(5,4,3,2,1);
		System.out.println(a);
		
		a.sort((Integer o1, Integer o2) -> {
			return Integer.compare(o1, o2);
		});
		
		System.out.println(a);
		
//		lista.sort(new Comparator<Integer>() {
//			
//			public int compare(Integer o1, Integer o2) {
//				if (o1 == o2) {
//					return 0;
//				} else if (o1 > o2) {
//					return 1;
//				} else {
//					return -1;
//				}
//			}
//		});
		
//		System.out.println(lista);
		
		
//		Client cliente1 = new Client("cliente 1", "9876543210", "123-132-123");
//	    Client cliente2 = new Client("cliente 2", "1300006841", "000-999-000");
//	      
//	    AhorroCuenta cuentaAhorroCliente1 = new AhorroCuenta(100.0D, 1, 777, cliente1);
//	    AhorroCuenta cuentaAhorroCliente2 = new AhorroCuenta(0.0D, 2, 666, cliente2);
//	    AhorroCuenta cuentaAhorroCliente3 = new AhorroCuenta(0.0D, 1, 777, cliente1);
//	    
//	    CreditoCuenta creditoCuentaCliente1 = new CreditoCuenta(100.0D, 1, 777, cliente1);
//	    CreditoCuenta creditoCuentaCliente2 = new CreditoCuenta(0.0D, 2, 666, cliente2);
//	    
//	    if (cuentaAhorroCliente1.equals(cuentaAhorroCliente3)) {
//	    	System.out.println("Es igual");
//	    }
//	    
//	    SaveCuenta arrayCuentas = new SaveCuenta();
	    
//	    arrayCuentas.save(cuentaAhorroCliente1);
//	    arrayCuentas.save(cuentaAhorroCliente2);
//	    arrayCuentas.save(cuentaAhorroCliente1);
//	    
	    
//	    arrayCuentas.save(creditoCuentaCliente1);
//	    arrayCuentas.save(creditoCuentaCliente2);
	    

	    
//	    Iterable<Cuenta> resultado = (Iterable<Cuenta>) arrayCuentas.getAllCuentas();
//	    for (Cuenta c: resultado ) {
//	    	System.out.println(c);
//	    }
//	    resultado.forEach(item -> {
//	    	System.out.println(item);
//	    });
	    
	    
	    
	    
	    
	    
	    
//	    arrayCuentas.getCantidad();
//
//	    
//	    int numero = arrayCuentas.getIndex(cuentaAhorroCliente2);
//	    System.out.println(numero);
//	    System.out.println(arrayCuentas.getCuenta(numero));
	    
	    
	    

	}

}
