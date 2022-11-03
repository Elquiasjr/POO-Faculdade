package lista02.exercicio2;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa pessoa01 = new Pessoa("Elquias", "Masculino", "193.120.120-02", 20, 1.67, 67);
		pessoa01.andar();
		pessoa01.correr();
		pessoa01.falar();
		pessoa01.dormir();
		System.out.println(pessoa01);
		
	}
}
