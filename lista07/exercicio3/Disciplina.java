package lista07.exercicio3;

public class Disciplina {

	private int codigo;
	private String disciplina;
	private int cargaHorario;
	
	public Disciplina(int codigo, String disciplina, int cargaHorario) {
		super();
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.cargaHorario = cargaHorario;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", disciplina=" + disciplina + ", cargaHorario=" + cargaHorario + "]";
	}
	
	
}
