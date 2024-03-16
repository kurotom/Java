package primeros_pasos_java;

public class Pila_ejecucion {
	
	public static void main(String[] args) {
		System.out.println("inicio de main");
		metodo1();
		System.out.println("Fin de main");
	}
	
	public static void metodo1() {
		System.out.println("inicio de metodo1");
		metodo2();
		System.out.println("fin de metodo1");
	}
	
	public static void metodo2() {
		System.out.println("inicio de metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("fin de metodo2");
	}

}

 