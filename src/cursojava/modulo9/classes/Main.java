package cursojava.modulo9.classes;

public class Main {

	public static void main(String[] args) {
		/* TODO Modulo 9 - Aula 9.5 - Primeira Classe e Objeto Aluno*/
		
		//Objeto ainda não existe na memoria
		Aluno aluno;
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		aluno1.idade = 30;
		
		System.out.println("Nome do aluno 1 é " + aluno1.nome);
		System.out.println("Idade é = " + aluno1.idade);
		
		//Agora temos um objeto real na memoria
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno("Maria");
		
		Aluno aluno4 = new Aluno("Jose", 50);
	}

}
