package cursojava.modulo10.interfaces;

/*Essa interface ser� o nosso contrato de autentica��o*/
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);/*Apenas declara��o do metodo*/
	
	public boolean autenticar();
	
}
