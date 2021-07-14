package cursojava.modulo13.arrayematriz;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.modulo9.lista.Aluno;
import cursojava.modulo9.lista.Disciplina;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		
		/*TODO Array pode ser de todos o tipos de dados e objetos também*/
		
		double[] notas = {8.8, 9.7,7.6,6.8};
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};
		
		//Criação do aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Enivaldo Queiroz");
		aluno.setNomeEscola("JDEV Treinamento");
		
		//Criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Calculo II");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//Lista de disciplinas
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso : " + aluno.getNomeEscola());
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("------------------- Disciplinas do aluno -------------------");
			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			//Percorrendo as notas das disciplinas
			double notaMax = 0.0;
			double notaMin = 0.0;
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + " é " + d.getNota()[pos]);
				
				//Verificar a maior nota
				if (pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
				
				//Verificar a menor nota
				if (pos == 0) {
					notaMin = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] < notaMin) {
						notaMin = d.getNota()[pos];
					}
				}
				
			}
			System.out.println("A maior nota da Disciplina = " + d.getDisciplina() + " é de valor : " + notaMax);
			System.out.println("A menor nota da Disciplina = " + d.getDisciplina() + " é de valor : " + notaMin);
		}
		
		//disciplina.setNota(null);
		
		//String posicaes = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
		
		/*Array sem deve ter a quantidade de posições definidas*/
		/*double[] notas = new double[Integer.parseInt(posicaes)];
		
		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + (pos + 1));
			notas[pos] = Double.valueOf(valor);
		}
		
		for(int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}*/
		
		/*Atribuir valores na posição do array*/
		/*notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 6.0;*/
		
		/*System.out.println("nota 1 " + notas[0]);
		System.out.println("nota 2 " + notas[1]);
		System.out.println("nota 3 " + notas[2]);
		System.out.println("nota 4 " + notas[3]);
		
		for(int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
		*/
		
		
	}

}
