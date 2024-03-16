package java_utils.com.javaUtils;


import java.util.ArrayList;


public class java_ArrayList {
	public static void main(String[] args) {
		
//	ArrayList
//		permite el uso de métodos, hereda de List
//		permite solamente datos del mismo tipo
//		de diferente tipo no compila
//		usando Object permite todos los tipos
		
		ArrayList<Integer> listaNumero = new ArrayList<>();
		
		listaNumero.add(1);
		listaNumero.add(2);
		listaNumero.add(3);
		listaNumero.add(4);
		
		
		listaNumero.forEach(item -> {
			System.out.println(item);
		});
		
		
		for (Integer valor: listaNumero) {
			System.out.println(valor);
		}
		
	}
}
