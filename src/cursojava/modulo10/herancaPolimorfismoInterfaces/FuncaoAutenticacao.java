package cursojava.modulo10.herancaPolimorfismoInterfaces;

import cursojava.modulo10.interfaces.PermitirAcesso;

/*Receber que tem o contrato de permitir acesso */
public class FuncaoAutenticacao {

	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
}
