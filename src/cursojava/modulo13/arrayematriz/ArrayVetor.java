package cursojava.modulo13.arrayematriz;

public class ArrayVetor {
	
	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		
		/*TODO Array pode ser de todos o tipos de dados e objetos tamb�m*/
		
		/*Array sem deve ter a quantidade de posi��es definidas*/
		double[] notas = new double[5];
		
		/*Atribuir valores na posi��o do array*/
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 6.0;
		
		/*System.out.println("nota 1 " + notas[0]);
		System.out.println("nota 2 " + notas[1]);
		System.out.println("nota 3 " + notas[2]);
		System.out.println("nota 4 " + notas[3]);*/
		
		for(int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � = " + notas[pos]);
		}
	}

}
