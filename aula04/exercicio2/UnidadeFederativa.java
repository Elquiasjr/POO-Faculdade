package aula04.exercicio2;

public enum UnidadeFederativa {
	ESPIRITO_SANTO("Espírito Santo","ES","Vitória"),
	SAO_PAULO("São Paulo","SP","São Paulo"),
	RIO_DE_JANEIRO("Rio de Janeiro","RJ","Rio de Janeiro"),
	PARANA("Paraná","PR","Curitiba"),
	MINAS_GERAIS("Minas Gerais","MG","Belo Horizonte"),
	SANTA_CATARINA("Santa Catarina", "SC", "asdfasd"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul","RS","asdfasd");
	
	String NomeUF;
	String Sigla;
	String NomeCapital;
	
	private UnidadeFederativa(String NomeUF, String Sigla, String NomeCapital) {
		this.NomeUF = NomeUF;
		this.Sigla = Sigla;
		this.NomeCapital = NomeCapital;
	}

	public String getNomeUF() {
		return NomeUF;
	}

	public String getSigla() {
		return Sigla;
	}

	public String getNomeCapital() {
		return NomeCapital;
	}
	
	
}
