package cursojava.modulo9.lista;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Modulo 9 - Aula9.20 - Criando a lista de disciplinas no objeto Aluno
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

		// Aula 9.14
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

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(80);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Calculo Integral");
		disciplina3.setNota(70);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Construção de Compiladores");
		disciplina4.setNota(70);

		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);

		System.out.println(aluno1); // Descrição do objeto na memoria
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
	}

}
