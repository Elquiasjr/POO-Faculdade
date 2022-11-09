package lista06.exercicio2;

public class ImovelVelho extends Imovel{
	private double desconto;

	public ImovelVelho(double valorBase, Endereco endereco, double desconto) {
		super(valorBase, endereco);
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "ImovelVelho [desconto=" + desconto + ", valorBase=" + valorBase + ", endereco=" + endereco + "]";
	}

	
	
}
