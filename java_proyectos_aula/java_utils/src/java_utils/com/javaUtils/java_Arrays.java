package java_utils.com.javaUtils;

import java.util.Arrays;
import java.util.List;

public class java_Arrays {
	
//	Arrays
//	permite utilizar métodos para manipular array

	public static void main(String[] args) {
		
		int[] integers = {2, 1, 5, 0 , 3, 4};

		System.out.println();
		for (int value: integers) {
			System.out.println(value);
		}
	
		Arrays.sort(integers);
		
		System.out.println();
		for (int value: integers) {
			System.out.println(value);
		}
		
//		Transformar una array no generico en un List.
//		utilizando wrapper para crear lista.
		
		Integer[] unalista = new Integer[] {10, 22, 33, 14, 25};

		List<Integer> algo = Arrays.asList(unalista);
			
		
		Arrays.sort(unalista);
		
		System.out.println();
		algo.forEach(c -> {
			System.out.println(c);
		});
		
		

	}
}
