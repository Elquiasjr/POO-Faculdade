package lista07.exercicio2;

public class Prato {
	
	protected int idPrato;
	protected String nomePrato;
	protected String descIngredientes;
	protected double precoUnitario;
	
	public Prato(int idPrato, String nomePrato, String descIngredientes, double precoUnitario) {
		this.idPrato = idPrato;
		this.nomePrato = nomePrato;
		this.descIngredientes = descIngredientes;
		this.precoUnitario = precoUnitario;
	}
	
	public int getIdPrato() {
		return idPrato;
	}
	public String getNomePrato() {
		return nomePrato;
	}
	public String getDescIngredientes() {
		return descIngredientes;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	@Override
	public String toString() {
		return "idPrato:" + idPrato + ", nomePrato=" + nomePrato + ", descIngredientes=" + descIngredientes
				+ ", precoUnitario=" + precoUnitario;
	}
	
	
}
