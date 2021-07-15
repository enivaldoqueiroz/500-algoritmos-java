package cursojava.modulo13.arrayematriz;

public class Matriz {

	public static void main(String[] args) {
		// TODO Matriz
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 60;
		notas[1][2] = 30;
		
		
		//System.out.println(notas[0][0]);
		
		//Percorrer as linhas
		for(int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("===================================");
			//Percorrer cada uma das colunas
			for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);
			}
			
		}

	}

}
