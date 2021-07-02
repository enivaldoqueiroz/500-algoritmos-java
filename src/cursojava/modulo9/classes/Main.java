package cursojava.modulo9.classes;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/* TODO Modulo 9 - Aula 9.5 - Primeira Classe e Objeto Aluno*/
		
		//Objeto ainda não existe na memoria
		Aluno aluno;
		
		//Aula 9.14
		/*
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual RG?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome da pai");
		String matricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Qual a seire?");
		String escola = JOptionPane.showInputDialog("Nome da escola");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		//Aula 9.14
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		aluno1.setNota1(Double.parseDouble(nota1));	
		aluno1.setNota2(Double.parseDouble(nota2));	
		aluno1.setNota3(Double.parseDouble(nota3));	
		aluno1.setNota4(Double.parseDouble(nota4));	
		
		System.out.println(aluno1.toString()); // Descrição do objeto na memoria
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		/*
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Nome mãe: " + aluno1.getNomeMae());
		System.out.println("Nome pai: " + aluno1.getNomePai());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		System.out.println("Media da nota: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado2: " + aluno1.getAlunoAprovado2());
		*/
		
		/* Aula 9.16 - Equals e hashcode (Diferenciar e comparar objetos)*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lana");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Lana");
		aluno2.setNumeroCpf("123");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Aluno são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
		
		/*===============================================================*/
		/*System.out.println("\n");
		//Agora temos um objeto real na memoria
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Nome do aluno 1 é " + aluno2.getNome());
		System.out.println("Idade é = " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno("Maria");
		
		Aluno aluno4 = new Aluno("Jose", 50);
		*/
		
		
	}

}
