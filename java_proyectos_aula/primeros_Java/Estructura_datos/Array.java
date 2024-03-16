package Estructura_datos;

public class Array {
	
	public static void main(String[] args) {
		
		int[] array = new int[5];
//		array[0] = 2;
//		array[1] = 3;
//		System.out.println(array[0]);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = i + 1;
			}
			System.out.println(array[i]);
		}
		
		int[] refs = {1,2,3,4,5};
		
		System.out.println(refs[0]);
		
	}
	
}
