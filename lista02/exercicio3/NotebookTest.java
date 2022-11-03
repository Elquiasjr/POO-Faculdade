package lista02.exercicio3;

public class NotebookTest {

	public static void main(String[] args) {
	Notebook notebook01 = new Notebook("Asus", "Thunder", "Intel", 4000, 1000000, 16.6);
	
	notebook01.ligar();
	notebook01.desligar();
	notebook01.processarInfo();
	notebook01.conectarInternet();
	
	System.out.println(notebook01);
	
	}

}
