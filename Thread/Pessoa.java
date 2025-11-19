package aula1811;

public class Pessoa extends Thread{
	
	public Pessoa() {
		
	}
	
	public void assobiar() {
		System.out.println("Assobiando...");
	}
	
	public void chuparCana() {
		System.out.println("Chupando cana...");
	}
	
	public void run() {
		
		assobiar();
		chuparCana();
		
	}
	
	
	

}
