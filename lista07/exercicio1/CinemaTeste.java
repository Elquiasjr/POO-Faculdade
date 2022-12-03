package lista07.exercicio1;

public class CinemaTeste {

	public static void main(String[] args) {
		
//		
		Cinema cinemark = new Cinema();
		
		cinemark.adicionarSessao("22/12/2022", "10:20", 1, 30, "Happy Farm", 120);
		
		cinemark.imprimirRelatorio("22/12/2022", "10:20");
		
		cinemark.venderIngresso(50, "22/12/2022", "10:20");
		cinemark.venderIngresso(5, "22/12/2022", "10:20");
	}

}
