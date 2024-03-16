package java_utils.com.javaUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class java_Collections {

	public static void main(String[] args) {
		
		
		List<Integer> lista1 = new ArrayList<>();
		lista1.add(2);
		lista1.add(1);
		lista1.add(0);

		
		
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(8);
		lista2.add(5);
		lista2.add(9);
		
		System.out.println(lista2);
		
		Collections.shuffle(lista2);
		
		System.out.println(lista2);
		
		List<Integer> lista3 = new ArrayList<>(lista1);
		
		System.out.println(lista1);
		System.out.println(lista3);
		
		
		Collections.reverse(lista3);
		
		System.out.println(lista3);
		
		Collections.rotate(lista3, 1);
		
		System.out.println(lista3);
		
		
		
		
	}
}
