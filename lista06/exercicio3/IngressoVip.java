package lista06.exercicio3;

public class IngressoVip extends Ingresso {
	private double valorAdicional;
	private String localizacao;
	
	public IngressoVip(double valorReais, String tipoIngresso, double valorAdicional, String localizacao) {
		super(valorReais, tipoIngresso);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
	}
	
	private double calcularValorIngressoVip() {
		return valorAdicional + valorReais;
	}
	
	@Override
	public void imprimirDadosIngresso() {
		super.imprimirDadosIngresso();
		System.out.println("Valor Adicional: R$" + valorAdicional + "\nLocalização: " + localizacao + "\nValor Ingresso Vip: R$" + calcularValorIngressoVip() + "\n");
	}

}
