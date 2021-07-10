package cursojava.modulo9.poo;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		// TODO Modulo9 - 9.36 - LIVE EXTRA - Java e Orientação a Objetos na Pratica
		
		//Produtos
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientação a Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		
		
		//Venda
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Maria Lana");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		
		System.out.println("Descrição Venda : " + venda);
				

	}

}
