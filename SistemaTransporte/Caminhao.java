package Principal;

public class Caminhao extends Automovel {
	
	public Caminhao() {
		this.capacidade = 3;
		this.velocidadeMax = 150;
	}
	
	public void tempoExtimado() {
		super.tempoExtimado();
		double t = 300 / velocidadeMax;
		System.out.println(t + "0 horas");	
	}
	
	public void exibirInfo() {
		System.out.println("Tipo: Caminhão");
		super.exibirInfo();
		tempoExtimado();
	}
	
}
