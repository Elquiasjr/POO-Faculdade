package lista06.exercicio2;

public class ImovelNovo extends Imovel{
	private double adicional;

	
	public ImovelNovo(double valorBase, Endereco endereco, double adicional) {
		super(valorBase, endereco);
		this.adicional = adicional;
	}


	public void imprimirRelatorio() {
		System.out.println("Imovel Novo -\nValor base: " + valorBase + "\nEndereço: " + endereco + "\nPreço + Adicional: " + adicional);
	}

}
