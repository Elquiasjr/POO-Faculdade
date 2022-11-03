package lista04.exercicio2;

/* O Departamento Acadêmico de Informática deseja automatizar o processo de criação de
disciplinas para os seus cursos. Desenvolva um sistema que seja capaz de criar novas
disciplinas. Em uma conversa com os coordenadores de cursos foi possível identificar que
uma disciplina é constituída de seu código, nome, modalidade (Presencial ou A Distância),
carga horária (em horas) e professor que a ministra. Por sua vez, o professor é identificado
pelo seu registro, nome, data de nascimento e salário. Cada disciplina pode exibir um relatório
(uma espécie de resumo), ilustrando ao usuário do sistema os valores de seus dados,
inclusive os dados do professor que a ministra. Para efetuar a instanciação de cada disciplina,
atribuição de valores e invocação dos métodos, utilize uma classe de teste*/

public class Disciplina {
	private int codigo;
	private String nome;
	private String modalidade;
	private String cargaHoraria;
	private Professor professor;
	
	public Disciplina(int codigo, String nome, String modalidade, String cargaHoraria, Professor professor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}
	

	public void ImprimirDisciplina() {
		System.out.println("codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", cargaHoraria="
				+ cargaHoraria + "\nprofessor=" + professor);
	}
	

}
