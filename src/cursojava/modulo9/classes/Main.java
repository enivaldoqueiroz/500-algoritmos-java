package cursojava.modulo9.classes;

public class Main {

	public static void main(String[] args) {
		/* TODO Modulo 9 - Aula 9.5 - Primeira Classe e Objeto Aluno*/
		
		//Objeto ainda não existe na memoria
		Aluno aluno;
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setIdade(30);
		aluno1.setDataNascimento("03/11/1991");
		aluno1.setRegistroGeral("12345.12345.345");
		aluno1.setNumeroCpf("123.123.123-12");
		aluno1.setNomeMae("Chica Antonia");
		aluno1.setNomePai("Zé Maria");
		aluno1.setDataMatricula("10/01/2021");
		aluno1.setSerieMatriculado("9");
		aluno1.setNomeEscola("Escola JDEV Treinamentos");
		
		
		System.out.println("Nome do aluno 1 é " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		
		/*===============================================================*/
		System.out.println("\n");
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
	}

}
