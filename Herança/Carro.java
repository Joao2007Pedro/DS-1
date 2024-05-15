public class Carro extends Veiculo { 
	private int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	
	public void Imprime() {
		System.out.print("Marca: " +this.getMarca());
		System.out.print(" Modelo: " +this.getModelo());
		System.out.print(" Ano: " +this.getAno());
		System.out.print(" Cor: " +this.getCor());
		System.out.print(" Quantida de Portas: " +this.quantidadePortas);
	}

}
