package cursojava.modulo10.interfaces;

/*Essa interface será o nosso contrato de autenticação*/
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);/*Apenas declaração do metodo*/
	
	public boolean autenticar();
	
}
