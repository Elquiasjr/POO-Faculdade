package lista07.exercicio3;

public class Processo {

	private int numero;
	private String dataCriacao;
	private String descricao;
	
	public Processo(int numero, String dataCriacao, String descricao) {
		super();
		this.numero = numero;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Processo [numero=" + numero + ", dataCriacao=" + dataCriacao + ", descricao=" + descricao + "]";
	}
	
}
