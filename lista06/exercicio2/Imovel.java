package lista06.exercicio2;

/*Crie a classe Imovel, que possui um endereço e um valor base.
Crie uma classe ImovelNovo, que herda Imovel e possui um adicional no preço. Crie métodos de acesso
e impressão dos seus dados.
Crie uma classe ImovelVelho, que herda imóvel e possui um desconto no preço. Crie métodos de
acesso e impressão dos seus dados.
Crie uma classe TestaImovel. Utilize essa classe para instanciar imóveis do tipo ImovelNovo e
ImovelVelho e invocar os métodos que imprimem os dados de cada imóvel.*/

public class Imovel {
	protected double valorBase;
	protected Endereco endereco;
	
	public Imovel(double valorBase, Endereco endereco) {
		super();
		this.valorBase = valorBase;
		this.endereco = endereco;
	}
}
