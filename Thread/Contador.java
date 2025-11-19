package aula1811;

public class Contador extends Thread{	
	// Ou implements Runnable
	
	protected int max;
	protected String nome;
	
	public Contador(String nome, int max) {
		this.nome = nome;
		this.max = max;
	}
	
	public void contar() throws InterruptedException  {	
		try {		
			for(int i = 1; i <= this.max; i++) {
				
				Thread.sleep(1000);
				System.out.println(this.nome + "-" + i);
			}
		}
		finally {
			System.out.println("Contagem finalizada...");
		}
	}
	
	
	//------------------------------------------------------------------------------------------------------------------------
	
	
	// Extendendo e sobrescrevendo o método run de Thread -- Também se faz o mesmo se você implementar o Runnnable:
	@Override
	public void run() {
		try {
			contar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
