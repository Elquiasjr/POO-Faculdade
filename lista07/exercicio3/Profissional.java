package lista07.exercicio3;

public abstract class Profissional {
	protected int registro;
	protected String nome;
	protected String dataAdmissao;
	protected double salarioBase;
	
	public Profissional(int registro, String nome, String dataAdmissao, double salarioBase) {
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
	}
	
	public abstract void calcularSalario();
	
	public abstract void imprimirRelatorio();
}
