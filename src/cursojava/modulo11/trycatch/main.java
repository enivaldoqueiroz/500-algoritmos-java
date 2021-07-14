package cursojava.modulo11.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.annotation.processing.FilerException;
import javax.swing.JOptionPane;

import cursojava.modulo10.herancaPolimorfismoInterfaces.FuncaoAutenticacao;
import cursojava.modulo10.herancaPolimorfismoInterfaces.Secretario;
import cursojava.modulo10.interfaces.PermitirAcesso;
import cursojava.modulo9.constantes.StatusAluno;
import cursojava.modulo9.lista.Aluno;
import cursojava.modulo9.lista.Disciplina;

public class main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		try {
			
			//lerArquivo();
			
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		/*Secretario secretario = new Secretario(); //Diretamente com o abjeto
		secretario.setLogin(login);
		secretario.setSenha(senha);*/
		
		FuncaoAutenticacao autenticao = new FuncaoAutenticacao();
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
				
		if (autenticao.autenticarCursoJava(permitirAcesso)) {/*Travar o contrato para quem tem autorização*/			
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/* TODO HASHMAP é uma lista que dentro dela temos um a chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
		
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
		for(int pos = 1; pos <= 1; pos++ ) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos +" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ pos +" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			//disciplina.setNota(Double.valueOf(notaDisciplina));
			
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
				
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		/* Fim do try*/
		}catch(NumberFormatException e){
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();/*Imprime erro no console Java*/
			
			System.out.println("Mensagem: " + e.getMessage());
			
			for (int i = 0; i <= e.getMessage().length(); i++) {
				
				saida.append("\n Classe de erro : " + e.getStackTrace()[i].getClassName());
				saida.append("\n Metodo de erro : " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro : " + e.getStackTrace()[i].getLineNumber());
				
				/*System.out.println("Classe de erro : " + e.getStackTrace()[i].getClassName());
				System.out.println("Metodo de erro : " + e.getStackTrace()[i].getMethodName());
				System.out.println("Linha de erro : " + e.getStackTrace()[i].getLineNumber());*/
			}
			JOptionPane.showMessageDialog(null, "Erro ao processar notas " + saida.toString());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro no null pointer exception " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Todos os erros" + e.getClass().getName());
		}finally {/*Sempre vai ser executado ocorrendo erro ou não*/
		
			JOptionPane.showConfirmDialog(null, "Aprendendo JAVA");
		}

	}
	
	public static void lerArquivo() throws ExecaoProcessarNota{
		try {
			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExecaoProcessarNota(e.getMessage());
		}
		
	}

}
