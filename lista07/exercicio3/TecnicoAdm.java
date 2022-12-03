package lista07.exercicio3;

public class TecnicoAdm extends Profissional{

	private double adicionalNoturno;
	private Processo processo;

	public TecnicoAdm(int registro, String nome, String dataAdmissao, double salarioBase, double adicionalNoturno,
			Processo processo) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.adicionalNoturno = adicionalNoturno;
		this.processo = processo;
	}

	@Override
	public void calcularSalario() {
		System.out.println("O salário do Técnico de Admnistração " + nome + ": R$" + (this.salarioBase + this.adicionalNoturno));
	}

	@Override
	public void imprimirRelatorio() {
		System.out.println("TecnicoAdm [adicionalNoturno=" + adicionalNoturno + ", registro=" + registro + ", nome=" + nome
				+ ", dataAdmissao=" + dataAdmissao + ", salarioBase=" + salarioBase + ", processo: " + processo);
		
	}

	
}
