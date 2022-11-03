package aula04.exercicio1;

public class Cliente {
	private int codigo;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estadoCivil;
	
	public Cliente(int codigo, String nome, String dataNascimento, EstadoCivil estadoCivil) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
	}

	public void SetEstadoCivil(EstadoCivil estadoCivil){
		this.estadoCivil = estadoCivil;
			}
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", estadoCivil="
				+ estadoCivil + "]";
	}
	
	
}
