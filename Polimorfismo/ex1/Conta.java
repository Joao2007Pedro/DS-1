public class Conta {
	private String nome;
	private String CPF;
	private String numeroConta;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar (double quantia) {
		return quantia+saldo;
	}
	
	public double sacar (double quantia) {
		return quantia-saldo;
	}
	
	public void ImprimirSaldo() {
		System.out.println("saldo: "+saldo);
	}
	
}
