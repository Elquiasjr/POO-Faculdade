package lista02.exercicio4;

public class LivroTest {
	public static void main(String[] args) {
		System.out.println("UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ\n"
				+ "CAMPUS PONTA GROSSA\n"
				+ "DEPARTAMENTO ACADÊMICO DE INFORMÁTICA");
		Livro livro01 = new Livro("Sistemas Operacionais", "Paulo Muzy", "Nacional", true ,245, 2007);
		Livro livro02 = new Livro("1964", "George Orwell", "Hupo Brothers", false ,501, 1920);
		
		livro01.emprestarLivro();
		livro01.devolverLivro();	
		livro02.emprestarLivro();
		livro02.devolverLivro();
	}

}
