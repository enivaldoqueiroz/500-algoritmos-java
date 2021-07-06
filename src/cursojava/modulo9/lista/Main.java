package cursojava.modulo9.lista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <= 2; qtd++) {
			
				
		// TODO Modulo 9 - Aula9.20 - Criando a lista de disciplinas no objeto Aluno
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual RG?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome da pai");
		String matricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Qual a seire?");
		String escola = JOptionPane.showInputDialog("Nome da escola");*/

		// Aula 9.14
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		
		//Adicionando Disciplina e Nota
		for(int pos = 1; pos <= 2; pos++ ) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos +" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ pos +" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		//Removendo Disciplina
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) { /*TODO Opção SIM = 0*/
			
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);	
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}
		alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("alex")) {
				System.out.println(aluno); // Descrição do objeto na memoria
				System.out.println("Media do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("---------------------------------------------------------------");
				break;	
			}
			
		}
		
	}

}
