package lista07.exercicio2;

public class Conta {

	private Prato pratoEntrada;
	private Prato pratoPrincipal;
	private Prato sobremesa;
	private double valorConta;
	
	public Conta() {
	}
	
	public void adicionarPratoEntrada(int idPrato, String nomePrato, String descIngredientes, double precoUnitario) {
		this.pratoEntrada = new PratoEntrada(idPrato, nomePrato, descIngredientes, precoUnitario);
	}
	
	public void adicionarPratoPrincipal(int idPrato, String nomePrato, String descIngredientes, double precoUnitario) {
		this.pratoPrincipal = new PratoPrincipal(idPrato, nomePrato, descIngredientes, precoUnitario);
	}
	
	public void adicionarSobremesa(int idPrato, String nomePrato, String descIngredientes, double precoUnitario) {
		this.sobremesa = new Sobremesa(idPrato, nomePrato, descIngredientes, precoUnitario);
	}
	
	public double calcularTotalCliente() {
		this.valorConta = ((sobremesa == null? 0 : sobremesa.getPrecoUnitario() )+ (pratoEntrada == null? 0 : pratoEntrada.getPrecoUnitario()) + (pratoPrincipal == null? 0 : pratoPrincipal.getPrecoUnitario()))*1.10;
		return this.valorConta;
	}
	
	public void imprimirPratos() {
		System.out.println("pratoEntrada:" + pratoEntrada
				+ "\npratoPrincipal:" + pratoPrincipal + "\nsobremesa:" + sobremesa);

	}
	
	
}
