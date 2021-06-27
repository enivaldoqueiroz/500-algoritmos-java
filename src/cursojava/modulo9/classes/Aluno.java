package cursojava.modulo9.classes;

//Está é a classe/objeto que representa o Aluno

/* TODO Modulo 9 - Aula 9.5 - Primeira Classe e Objeto Aluno*/
public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() {
		// TODO Cria os dados na memoria - Sendo padrão do Java
	}
	
	public Aluno (String nomePadrao) {
		this.nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		this.nome = nomePadrao;
		this.idade = idadePadrao;
	}
	
}
