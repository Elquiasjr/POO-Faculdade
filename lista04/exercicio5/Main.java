package lista04.exercicio5;


public class Main {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua dos Pilares", 23, "Nova Russia", "Dois Vizinhos", "Santa Catarina");
		Local local1 = new Local("PitBulls Green PUB", endereco1, 200);
		Artista artista1 = new Artista("Roberto Carlos", "Espanhola", "Eu quero ter um milhão de amigos");
		Evento evento1 = new Evento("Show da Virada", artista1, "31/12/2023", local1, "+12");
		
		evento1.VenderIngresso(50);

	}

}
