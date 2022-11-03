package aula04.exercicio2;

public class Empresa {
	String razaoSocial;
	int cnpj;
	UnidadeFederativa unidadeFederativa;
	@Override
	
	
	public String toString() {
		return "Empresa razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", unidadeFederativa=" + unidadeFederativa.getNomeCapital() + ", " + unidadeFederativa.getNomeUF() + ", " + unidadeFederativa.getSigla();
	}
	
	public Empresa(String razaoSocial, int cnpj, UnidadeFederativa unidadeFederativa) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.unidadeFederativa = unidadeFederativa;
	}
	
	
}
