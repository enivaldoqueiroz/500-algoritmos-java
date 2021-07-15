package cursojava.modulo13.arrayematriz;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Split
		
		String text = " Lana, Curso Java, 80, 70, 90, 89";
		
		 String[] valoresArray = text.split(",");


		 System.out.println("Nome: " + valoresArray[0]);
		 System.out.println("Curso: " + valoresArray[1]);
		 System.out.println("Nota 1: " + valoresArray[2]);
		 System.out.println("Nota 2: " + valoresArray[3]);
		 System.out.println("Nota 3: " + valoresArray[4]);
		 System.out.println("Nota 4: " + valoresArray[5]);
		 
		 //Convertendo um Array em uma lista
		 System.out.println("===========================");
		 List<String> list = Arrays.asList(valoresArray);
		 
		 for (String valorString : list) {
			System.out.println(valorString);
		}
		 
		//Convertendo um lis para Array
		System.out.println("===========================");
		String[] conversaoArray = list.toArray(new String[6]);
		
		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}

}
