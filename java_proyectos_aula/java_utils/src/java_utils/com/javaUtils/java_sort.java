package java_utils.com.javaUtils;


import java.util.Comparator;
import java.util.ArrayList;


public class java_sort {
	
	public static void main(String[] args) {
		
//		ordenar los elementos mediante Clase Anónimas
//		usando Comparator e implementar el método
//		de Comparator (interface funcional)

		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(2);
		lista.add(3);
		lista.add(1);
		lista.add(4);

		          //  clase anónima
		lista.sort(new Comparator<Integer>() {
					
			public int compare(Integer o1, Integer o2) {
				if (o1 == o2) {
					return 0;
				} else if (o1 > o2) {
					return 1;
				} else {
					return -1;
				}
			}
		});
				
		System.out.println(lista);
		//  [5, 2, 3, 1, 4]
		//  [1, 2, 3, 4, 5]
		
		
	}
}
