package ProvaFinal;

public class Download extends Thread{
		
	protected String nome;
	
	public Download(String nome) {
		this.nome = nome;
	}
	
	@Override
	//Será inicada através do método start() na instância;
	public void run() {
		try {
			for(int i = 10; i <= 100; i+=10) {
					
				Thread.sleep(1000);
				System.out.println(this.nome+" - "+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		finally {
			System.out.println(this.nome + " finalizado!");
			
		}
	}
	
	
	
	
}
