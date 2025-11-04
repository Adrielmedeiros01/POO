package Principal;

public class Carro extends Automovel{
	
	public Carro() {
		this.capacidade = 5;
		this.velocidadeMax = 120;
	}
	
	public void tempoExtimado() {
		super.tempoExtimado();
		double t = 300 / 120 ;
		System.out.println(t + "0 horas");
		
	}
	
	public void exibirInfo() {
		System.out.println("Tipo: Carro");
		super.exibirInfo();
		tempoExtimado();
	}
}
