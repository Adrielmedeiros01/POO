package ProvaFinal;

import java.io.InterruptedIOException;

public class Contador extends Thread {
	
	protected String nome;
	protected int max;
	
	public Contador(String nome, int max) {
		this.nome = nome;
		this.max = max;
	}
	
	//Será inicada através do método start() na instância;
	@Override
	public void run() {
		try {
//			contar() // Função criada para refatorar/limpar/simplificar o método run();;
			try {
				for(int i = 0; i <= this.max; i++) {
					Thread.sleep(1000);
					System.out.println(this.nome+" - "+i);
				}
			}
			finally {
				System.out.println("Contagem finalizada!");
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
//	//Refatorando/simplificando a função run();
//	public void contar() throws InterruptedException{
//		try {
//			for(int i = 0; i <= this.max; i++) {
//				
//				Thread.sleep(1000);
//				System.out.println(this.nome+" - "+i);
//			}
//		}
//		
//		finally {
//			System.out.println("Contagem finalizada!");
//		}
//		
//	}
	
	
	
}
	
