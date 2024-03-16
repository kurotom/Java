package java_utils.com.javaUtils;

public class Array {
	public static void main(String[] args) {
		
//		Array
//		| 1 | 2 | 3 | 4 | valorPordefecto |
//		
//		los indices que no se declaran valor toman valor por defecto
//		del tipo de dato.
//		
		int[] arrayInt = new int[5];
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;
		arrayInt[3] = 4;
		
		for (int valor: arrayInt) {
			System.out.println(valor);
		}
		
		
	}
}
