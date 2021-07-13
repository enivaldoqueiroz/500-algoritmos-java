package cursojava.modulo9.lista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.modulo10.herancaPolimorfismoInterfaces.Secretario;
import cursojava.modulo10.interfaces.PermitirAcesso;
import cursojava.modulo9.constantes.StatusAluno;

public class Main {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		/*Secretario secretario = new Secretario(); //Diretamente com o abjeto
		secretario.setLogin(login);
		secretario.setSenha(senha);*/
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
				
		if (permitirAcesso.autenticar()) {/*Se TRUE acess se FALSE não acessa*/			
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/* TODO HASHMAP é uma lista que dentro dela temos um a chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
		
		for(int qtd = 1; qtd <= 5; qtd++) {
			
				
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
		for(int pos = 1; pos <= 1; pos++ ) {
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
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
				//alunosAprovados.add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
				//alunosRecuperacao.add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
				//alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("-----------------  Lista dos Aprovados  -----------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome do aluno " + aluno.getNome() +" Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
		
		System.out.println("-----------------  Lista dos Recuperação  -----------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome do aluno " + aluno.getNome() +" Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
		
		System.out.println("-----------------  Lista dos Reprovados  -----------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome do aluno " + aluno.getNome() +" Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
		
		/*System.out.println("-----------------  Lista dos Aprovados  -----------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Nome do aluno " + aluno.getNome() +" Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
		
		System.out.println("-----------------  Lista dos Recuperação  -----------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Nome do aluno " + aluno.getNome() +" Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}
		
		System.out.println("-----------------  Lista dos Reprovados  -----------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Nome do aluno " + aluno.getNome() +" Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
		}*/
		
		/*for(int pos = 0; pos < alunos.size(); pos ++) {
			
			Aluno aluno = alunos.get(pos);
			
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			
			// Percorrendo a Lista de Disciplina via Foreach
			//for (Disciplina disc : aluno.getDisciplinas()) {		
			//	System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());
			//}
			
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia = " + disc.getDisciplina() + " Nota = " + disc.getNota());
			}
			System.out.println("----------------------------------------------");
		}*/
		
		/*for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("alex")) {
				alunos.remove(aluno);
				break;	
			}else {
				System.out.println(aluno); // Descrição do objeto na memoria
				System.out.println("Media do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("---------------------------------------------------------------");
			}
			
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Aluno que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Sua materias são");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}*/
		
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		
	}

}
