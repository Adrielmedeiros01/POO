package aula1811;


public class Download extends Thread{
	
	
	protected String nome;
	
	public Download(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public void run(){
		
		for(int i = 10; i <= 100; i+=10){
			
			try {
				Thread.sleep(1000);
				System.out.println(this.nome + "...." + i + "%");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				
				if(i < 100) {
					System.out.println(this.nome + " = Download em andamento...");
				}
				
				else if (i == 100) {
					System.out.println(this.nome + " = Download Finalizado...");
				}
			}
			
		
		}
	}

}
