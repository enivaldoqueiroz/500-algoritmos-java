package cursojava.modulo10.herancaPolimorfismoInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplina = new ArrayList<Disciplina>();
	
	
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
	public List<Disciplina> getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, disciplina, nomeEscola, serieMatriculado);
	}
	@Override /*Identifica metodo sobreescrita*/
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplina, other.disciplina)
				&& Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}
	
	@Override/*Identifica metodo sobreescrita*/
	public boolean pessoaMaiorIdade() {
		
		return idade >= 21;
	}

	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade()  ? "Aluno é maior idade" : "Aluno é menor idade";
	}
}
