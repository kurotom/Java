package java_utils.com.javaUtils;

import java.util.Vector;

public class java_Vector {

	public static void main(String[] args) {
		
		Vector<Integer> algo = new Vector<>();
		
		algo.add(1);
		algo.add(4);
		algo.add(2);
		algo.add(5);
		
		int capacidad = algo.capacity();
		System.out.println(capacidad);
		
		
		algo.forEach(item -> {
			System.out.println(item);
		});
		
		
		System.out.println(algo.get(0));
		
		System.out.println(algo.size());
		
		algo.sort((Integer o1, Integer o2) -> {
			return Integer.compare(o1, o2);
		});
		
		System.out.println();
		algo.forEach(item -> {
			System.out.println(item);
		});

	}

}
