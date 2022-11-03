package lista05.exercicio4;

import java.util.List;
import java.util.ArrayList;

/*
 * Desenvolva um sistema de um estacionamento. Este estacionamento possui vagas que são
identificadas pelo seu número correspondente. 

Cada vaga pode conter um veículo que, por sua vez, é
identificado por sua placa. 

Deve ser possível calcular o custo permanência de cada veículo sabendo
sua hora inicial e hora final que o mesmo foi alocado/retirado da vaga. Obrigatoriamente a hora inicial
da alocação do veículo deve ser definida no momento que o mesmo foi atribuído a vaga. Por sua vez,
a hora final será definida no momento que o mesmo for retirado da vaga. O estacionamento possui
uma duração mínima de 3 horas, taxa mínima de 2 reais e um adicional de 0,50 centavos a cada hora
a mais que o veículo permanecer na vaga. Para realizar a inicialização do estacionamento, bem como
estacionar e retirar os veículos das vagas, utilize a classe EstacionamentoTeste.class.*/

public class Estacionamento {

	private List<Vaga> vagas;

	public Estacionamento() {
		super();
		this.vagas = new ArrayList<Vaga>();
	}
	
	public void adicionarVaga(int numeroVaga) {
		Vaga vaga = new Vaga(numeroVaga);
		vagas.add(vaga);
	}
	
	public void registrarCarro(int numeroVaga, String placa, int horaInicial) {
		for(Vaga vaga: vagas) {
			if(vaga.getNumeroVaga() == numeroVaga) {
			vaga.registrarCarroVaga(placa, horaInicial);
			return;
			}	
		}
		System.out.println("Vaga não encontrada!");
	}
	
	public void removerCarro(int numeroVaga, int horaFinal) {
		for(Vaga vaga: vagas) {
			if(vaga.getNumeroVaga() == numeroVaga) {
			vaga.removerCarroVaga(horaFinal);
			return;
			}
		}
		System.out.println("Vaga não encontrada!");
	}
}
