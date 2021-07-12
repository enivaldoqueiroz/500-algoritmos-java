package cursojava.modulo10.herancaPolimorfismoInterfaces;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO 
		
		Aluno aluno = new Aluno();
		aluno.setNome("Mila JDev - Treinamento");
		aluno.setNomeEscola("JDev - Treinamento");
		aluno.setIdade(21);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1q24r56yt6");
		diretor.setNome("Maia");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administrador");
		secretario.setNumeroCpf("45461632798");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade()  + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade() );
		System.out.println(secretario.pessoaMaiorIdade() );
		
		Aluno aluno2 = new Aluno();
		
		//Não é possivel instalacias uma classe abstrata
		//Pessoa pessoa = new Pessoa();

	}

}
