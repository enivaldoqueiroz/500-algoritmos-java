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
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo de Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Modulo Angular 8");
		produto3.setValor(BigDecimal.valueOf(100));
		
		Produto produto4 = new Produto();
		produto4.setId(3L);
		produto4.setNome("Modulo Hibernet 8");
		produto4.setValor(BigDecimal.valueOf(300));
		
		//Venda
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Maria Lana");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); /*Não é possivel fazer validações*/
		venda.addProduto(produto3);/*Posso fazer validações antes de adicionar na lista*/
		venda.addProduto(produto4);
				
		
		
		System.out.println("Valor da varialvel total venda: " + venda.getValorTotal());
				

	}

}
