package primeros_pasos_java;

public class ejercicio_factorial {
	
	public static void main (String[] args) {
		
// imprimir los factoriales del 1 al 10
		
		int cifra = 10;
		
		int r = 1;
		if (cifra == 0) {
			System.out.println(1);
		} else {
			for (int start = 1; start <= cifra; start++) {
				r = r * start;
			};
		};
		
		System.out.println(r);
		
	};
};
