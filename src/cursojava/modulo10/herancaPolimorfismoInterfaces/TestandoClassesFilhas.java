package cursojava.modulo10.herancaPolimorfismoInterfaces;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO 
		
		Aluno aluno = new Aluno();
		aluno.setNome("Mila JDev - Treinamento");
		aluno.setNomeEscola("JDev - Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1q24r56yt6");
		diretor.setNome("Maia");
		
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administrador");
		secretario.setNumeroCpf("45461632798");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
				

	}

}
