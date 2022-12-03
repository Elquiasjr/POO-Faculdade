package lista07.exercicio1;

import java.util.ArrayList;
import java.util.List;

	/**
	 * Implemente um sistema para um cinema controlar as sessões que estão ocorrendo. A Sessão é
identificada por uma data, horário e número de ingressos. Além disso, a Sessão possui uma Sala e um
Filme. A Sala é identificada por um número de identificação e a sua capacidade máxima. O Filme é
identificado pelo seu título e duração (minutos).
Os atributos: data e horário de cada sessão, bem como a sala e o filme que será transmitido, devem
ser iniciados com valores passados ao método construtos da classe. O atributo número de ingressos
será iniciado com a capacidade máxima da sala que será transmitida a sessão. 
Além disso, cada sessão pode vender ingressos. Para isso, deverá receber quantos ingressos devem ser vendidos, se a
quantia requerida for menor ou igual aos ingressos disponíveis para a sessão, deve-se realizar a venda,
caso contrário, uma mensagem relatando que não há disponíveis o número de ingressos requeridos,
deve ser exibida. Declare um método para exibir um relatório da sessão. Neste será exibido: data da
sessão, horário da sessão, total de ingressos vendidos, número da sala que ocorrerá a sessão, título
do filme que será exibido e duração em minutos do filme.
	 */

public class Cinema {

	List <Sessao> sessoes;

	public Cinema() {
		this.sessoes = new ArrayList<Sessao>();
	}
	
	public void adicionarSessao(String data, String horario, int numSala, int capacidadeMaxima, String titulo, int duracao) {
		sessoes.add(new Sessao(data, horario, numSala, capacidadeMaxima, titulo, duracao));
	}
	
	public void venderIngresso(int ingressosVendidos, String data, String horario) {
		for(Sessao sessao: sessoes ) {
			if(sessao.getData().equals(data) && sessao.getHorario().equals(horario)) {
				sessao.venderIngressoSessao(ingressosVendidos);
				return;
			}
		}
		System.out.println("Sessão não encontrada\n");
	}
	
	public void imprimirRelatorio(String data, String horario) {
		for(Sessao sessao: sessoes ) {
			if(sessao.getData().equals(data) && sessao.getHorario().equals(horario)) {
				sessao.imprimirRelatorioSessao();
				return;
			}
		}
		System.out.println("Sessão não encontrada\n");
	}
}
