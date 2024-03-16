package primeros_pasos_java;


public class matriz_triangulo {

	public static void main (String[] args) {
		
		String resultado = "";
		int tamano = 10;
		for (int ejeY = 1; ejeY < tamano; ejeY++) {
			
			for (int ejeX = 1; ejeX < tamano; ejeX++) {
				
				if (ejeY > ejeX) {
					break;
				}
				
				
				String algo = "*".repeat(2);
				System.out.println(algo);
				
//				
//				String c = "*".repeat(ejeX) + "\n";
				
			};
		};
		
		System.out.println(resultado);
		
	};

};