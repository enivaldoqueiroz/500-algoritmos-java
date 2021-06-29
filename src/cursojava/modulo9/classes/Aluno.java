package cursojava.modulo9.classes;

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
	
	// TODO Modulo 9 - Aula9.11 - Primeiro método de calculo de média de nota - Inicio
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
			
	// TODO Modulo 9 - Aula9.11 - Primeiro método de calculo de média de nota - Fim
	
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
	
	// TODO Modulo 9 - Aula9.11 - Primeiro método de calculo de média de nota - Inicio
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	//Metodos
	
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4)/4;
	}
	// TODO Modulo 9 - Aula9.11 - Primeiro método de calculo de média de nota - Fim
}
