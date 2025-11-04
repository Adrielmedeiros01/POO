package Principal;

public class Moto extends Automovel{
	
	
	public Moto() {
		this.capacidade = 2;
		this.velocidadeMax = 120;
	}
	
	public void tempoExtimado() {
		super.tempoExtimado();
		double t = 300 / velocidadeMax;
		System.out.println(t + "0 horas");

	}
	
	public void exibirInfo() {
		System.out.println("Tipo: Moto");
		super.exibirInfo();
		tempoExtimado();
	}
	
}
