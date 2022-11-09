package lista06.exercicio3;

public class IngressoTeste {

	public static void main(String[] args) {
		CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50);
		CamaroteInferior camaroteInferior = new CamaroteInferior(50);
		
		IngressoNormal ingressoNormal1 = new IngressoNormal(30, "Normal");
		
		camaroteSuperior.imprimirDadosIngresso();
		camaroteInferior.imprimirDadosIngresso();
		
		ingressoNormal1.imprimirDadosIngresso();
	}
}
