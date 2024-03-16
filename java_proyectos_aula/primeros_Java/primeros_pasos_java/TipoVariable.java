package primeros_pasos_java;

public class TipoVariable {
	
	public static void main(String[] args) {
	
		int edad = 30;
		System.out.println(edad);
		
		edad = 40 - 21;
		System.out.println(edad);
		
		String ALGO = "nada";
		System.out.println(ALGO);
		
		ALGO = "casa";
		System.out.println(ALGO);
		

		int[] anArray = {
			1, 2, 3
		};
		
		System.out.println("Declare Array " + anArray.length);
		System.out.println(anArray[1]);
		
		int[][] twoArray = {
			{1,2,3},
			{'a','b','c'}
		};
		System.out.println("Multiple Arrays: " + twoArray.length);
		
		
		int[] xArray;
		xArray = new int[2];
		xArray[0] = 1;
		xArray[1] = 2;

		System.out.println("index 0: " + xArray);
		
		String a;
		a = "1";
		System.out.println(Integer.valueOf(a));
		System.out.println(Float.valueOf(a));
		System.out.println(Long.valueOf(a));
		
		
	};
}
