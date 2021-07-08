package cursojava.modulo9.principiodaresponsabilidade;

public class TesteConta {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria de Lana");
		
		System.out.println(bancaria);
		
		bancaria.dimui100Reais();
		bancaria.dimui100Reais();
		System.out.println(bancaria);
		
		bancaria.sacarDinhero(400);
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		System.out.println(bancaria);
	}

}
