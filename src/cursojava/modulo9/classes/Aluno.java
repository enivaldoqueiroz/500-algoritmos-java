package cursojava.modulo9.classes;

import java.util.Objects;

//Está é a classe/objeto que representa o Aluno

/* TODO Modulo 9 - Aula 9.5 - Primeira Classe e Objeto Aluno*/
public class Aluno {

	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private Disciplina disciplina = new Disciplina();
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}	
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
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
	
	/* TODO Modulo 9 - Aula 9.10 - Os metódos comuns Getters e Setters*/
	/*Metodos GETTERS e SETTERS do Objeto
	 * SET é para adicionar ou receber dados para od atributos
	 * GET é para resgatar ou obter o valor do atributo*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	
	
	//Metodos
	
	public double getMediaNota() {
		return (disciplina.getNota1() + 
				disciplina.getNota2() + 
				disciplina.getNota3() + 
				disciplina.getNota4())/4;
	}
	// TODO Modulo 9 - Aula9.12 - Métodos com retorno se foi aprovado ou não - Inicio
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}		
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno está aprovado";
		} else {
			return "Aluno esta reprovado";
		}		
	}
	// TODO Modulo 9 - Aula9.12 - Métodos com retorno se foi aprovado ou não - Fim
		
	// TODO Modulo 9 - Aula9.11 - Primeiro método de calculo de média de nota - Fim
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}
}
