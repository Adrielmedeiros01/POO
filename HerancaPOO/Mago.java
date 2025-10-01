package poo;

public class Mago extends Personagem {
	
	
	protected int mana;
	
	
	public Mago(String nome, int nivel, int mana) {
		
		super(nome, nivel);
		this.mana = mana;
	}
	
	public void atacar() {
		super.atacar();
		System.out.println("Receba no pé da orelha!");
		this.mana--;
	}
	
	public void exibirStatus() {
		super.exibirStatus();
		System.out.println("Força: "+this.mana);
	}

}
