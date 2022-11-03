package lista04.exercicio1;

public enum Sexo {
	MASCULINO("masculino"),
	FEMININO("feminino");
	
	private String sexo;

private Sexo(String sexo) {
	this.sexo = sexo;
}

public String GetSexo() {
	return sexo;
}
}

