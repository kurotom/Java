package java_utils.com.javaUtils;


import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class java_Sets {

	public static void main(String[] args) {
		
		
		List<String> lista = List.of("uno", "dos", "tres", "cuatro", "cinco");
		
		Set<String> algoSet = new HashSet<String>();

		algoSet.addAll(lista);
		
		algoSet.forEach(item -> {
			System.out.println(item);
		});
		
		
		
		
	}
}
