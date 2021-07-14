package cursojava.modulo13.arrayematriz;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.modulo9.lista.Aluno;
import cursojava.modulo9.lista.Disciplina;

public class ArrayVetor {
	
	/*Usado para executar c�digo*/
	public static void main(String[] args) {
		
		/*TODO Array pode ser de todos o tipos de dados e objetos tamb�m*/
		
		double[] notas = {8.8, 9.7,7.6,6.8};
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};
		
		//Cria��o do aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Enivaldo Queiroz");
		aluno.setNomeEscola("JDEV Treinamento");
		
		//Cria��o da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Calculo II");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		//disciplina.setNota(null);
		
		//String posicaes = JOptionPane.showInputDialog("Quantas posi��es o array deve ter?");
		
		/*Array sem deve ter a quantidade de posi��es definidas*/
		/*double[] notas = new double[Integer.parseInt(posicaes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o = " + (pos + 1));
			notas[pos] = Double.valueOf(valor);
		}
		
		for(int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � = " + notas[pos]);
		}*/
		
		/*Atribuir valores na posi��o do array*/
		/*notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 6.0;*/
		
		/*System.out.println("nota 1 " + notas[0]);
		System.out.println("nota 2 " + notas[1]);
		System.out.println("nota 3 " + notas[2]);
		System.out.println("nota 4 " + notas[3]);
		
		for(int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � = " + notas[pos]);
		}
		*/
		
		
	}

}
