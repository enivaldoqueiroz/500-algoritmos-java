package cursojava.modulo13.arrayematriz;

public class ArrayOutraFormaDeAtribuirValores {

	public static void main(String[] args) {
		// TODO Array - Diferentes formas de atribuição de valores
		
		/* Forma 1
		String[] valores1 = new String[5];
		valores1[0] = "alex";
		valores1[1] = "95.5";
		valores1[2] = "Curso de Java";
		valores1[3] = "cotato@jdevtreinamento.com.br";
		valores1[4] = "80";*/
		
		/*Forma 2 */
		String[] valores2 = {"alex", "95.5", "Curso de Java", "cotato@jdevtreinamento.com.br", "80"};
		
		for(int pos = 0; pos < valores2.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + valores2[pos]);
		}
		
		/*Outra tipos de arrays*/
		
		int[] inteiros = new int[10];
		float[] floates = new float[10];

	}

}
