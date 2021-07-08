package cursojava.modulo9.principiodaresponsabilidade;

public class ContaBancaria {
	
	private String descricao;
	
	private double saldo = 8000;
	
	public void soma100Reais() {
		saldo +=100;
	}

	public void dimui100Reais() {
		saldo -=100;
	}
	
	public void sacarDinhero(double saque) {
		saldo -= saque;
	}
	
	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
}
