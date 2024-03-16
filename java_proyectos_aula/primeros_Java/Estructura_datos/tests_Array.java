package Estructura_datos;

import java.util.Arrays;

public class tests_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,24,5,6,2};
		
		Arrays.sort(array);
		
//		int indice = Arrays.binarySearch(array, 2);
//		System.out.println(array[indice]);
		
		
		int[] cons = Arrays.copyOfRange(array, 0, 2);
		for (int valor: cons) {
			System.out.println(valor);
		}
		
//		for (int valor: array) {
//			System.out.println(valor);
//		}
		
		

	}

}
