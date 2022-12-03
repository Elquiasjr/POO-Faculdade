package lista07.exercicio3;

public class Professor extends Profissional{

	private Titulacao titulacao;
	private Disciplina disciplina;
	

	public Professor(int registro, String nome, String dataAdmissao, double salarioBase, Titulacao titulacao,
			Disciplina disciplina) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.titulacao = titulacao;
		this.disciplina = disciplina;
	}

	@Override
	public void calcularSalario() {
		System.out.println("O salário do Professor " + nome + ": R$" + (this.salarioBase + this.titulacao.getValorGratificacao()));
	}

	@Override
	public void imprimirRelatorio() {
		System.out.println("Professor [titulacao=" + titulacao + ", registro=" + registro + ", nome=" + nome + ", dataAdmissao="
				+ dataAdmissao + ", salarioBase=" + salarioBase + ", disciplina :" + disciplina);
		
	}	

}
