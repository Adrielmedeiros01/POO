package poo;

public class Personagem {
	
	protected String nome;
	protected int nivel;
	
	public Personagem(String nome, int nivel) {
		this.nome = nome;
		this.nivel = nivel;
	}
	
	public void atacar(){
		
	}
	
	public void exibirStatus(){
		System.out.println();
		System.out.println("Nome: " + this.nome);
		System.out.println("Nível: " + this.nivel);
		
	}
	


}
