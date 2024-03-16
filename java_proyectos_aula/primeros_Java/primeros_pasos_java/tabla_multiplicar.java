package primeros_pasos_java;

public class tabla_multiplicar {
	
	public static void main (String[] args) {
		
		String stringFinal = "";

		for (int multiplicando = 0; multiplicando < 13; multiplicando++) {
			
			for (int multiplicador = 0; multiplicador < 13; multiplicador++) {
				
				String algo = "";
				int res = multiplicando * multiplicador;
				String resultado = String.format("| %s x %s = %s |", multiplicando, multiplicador, res);
				
				algo += resultado;
				System.out.println(algo);
				
				if (multiplicador == 12) {
					stringFinal += algo + "\n";
					algo = "";
				}
			};
		};
		
		System.out.print(stringFinal);
		
	};

}
