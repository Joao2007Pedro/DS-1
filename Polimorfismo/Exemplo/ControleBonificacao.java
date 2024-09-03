//Classe Para controlar os gastos da empresa com Bonificação
public class ControleBonificacao {
	//atributo soma, server para soma cada uma das bonificações 
	private double soma;
	
	
	//Método que recebe como parametro um objeto do tipo funcionario
	public void registra(Funcionario f) {
		//executando o getBonificalção especifico de cada funcionario e armazenado o valor dentro
		double boni = f.getBonificacao();
		
		
		// somando a variavel boni dentro da variavel soma
		this.soma = this.soma + boni; 
	}
	
	
	//método getSomna();
	public double getSoma() {
		
		return this.soma;
	}
	
}
