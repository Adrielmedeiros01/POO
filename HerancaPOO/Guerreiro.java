package poo;

public class Guerreiro extends Personagem {
	
	protected int forca;
	
	
	public Guerreiro(String nome, int nivel, int forca) {
		
		super(nome, nivel);
		this.forca = forca;
	}
	
	public void atacar() {
		super.atacar();
		System.out.println("Tome na titela!");
		this.forca--;
	}
	
	public void exibirStatus() {
		super.exibirStatus();
		System.out.println("Força: "+this.forca);
	}
}
