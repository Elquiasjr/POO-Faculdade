package lista04.exercicio2;

/*Por sua vez, o professor é identificado
pelo seu registro, nome, data de nascimento e salário. Cada disciplina pode exibir um relatório
(uma espécie de resumo), ilustrando ao usuário do sistema os valores de seus dados,
inclusive os dados do professor que a ministra. Para efetuar a instanciação de cada disciplina,
atribuição de valores e invocação dos métodos, utilize uma classe de teste*/

public class Professor {
	private int registro;
	private String nome;
	private String dataNascimento;
	private Double salario;
	
	public Professor(int registro, String nome, String dataNascimento, Double salario) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "registro=" + registro + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", salario=" + salario;
	}
	
	
}
