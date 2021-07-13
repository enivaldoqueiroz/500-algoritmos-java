package cursojava.modulo11.trycatch;

public class ExecaoProcessarNota extends Exception{

	public ExecaoProcessarNota(String erro) {
		super("Erro ao processar notas" + erro);
	}
}
