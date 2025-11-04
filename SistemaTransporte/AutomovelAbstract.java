package Principal;

public class Automovel {
	
	protected int capacidade;
	protected double velocidadeMax;
	
	public void tempoExtimado() {
		System.out.print("Tempo estimado em horas para 300 km: ");
	}
	
	public void exibirInfo() {
		System.out.println("Capacidade: " + capacidade);
		System.out.println("VelocidadeMAx: "+ velocidadeMax);
	}
	
	
	
}
