package java_utils.com.javaUtils;


import java.util.ArrayList;
import java.util.List;

public class java_List {
	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<String>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		
		
		lista.forEach(item -> {
			System.out.println(item);
		});
		
		
	}
}
