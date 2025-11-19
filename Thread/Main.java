package aula1811;

public class Main  {
	
	public static void helloworld() {
		System.out.println("------------------------------");
		System.out.println("Hello World!");
		System.out.println("Processando...");
		System.out.println("------------------------------");
	}
	public static void finish() {
		System.out.println("----------------------------------");
		System.out.println("Processo finalizado com sucesso!");
		System.out.println("----------------------------------");
	}
		
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Contador c1 = new Contador("Contador1", 5);
		Contador c2 = new Contador("Contador2", 5);
		
		Download d1 = new Download("Download1");
		Download d2 = new Download("Download2");
		
		try {
			
			helloworld();
			//Contador normal:
//			c1.contar();
//			c2.contar();
			
			// Utilizando o Threads (Faz executar os dois processos ao mesmo tempo);
//			c1.start();
//			c2.start();
	
			// Utilizando o Runnnable (Faz executar os dois processos ao mesmo tempo):
//			new Thread(c1).start();
//			new Thread(c2).start();
			
			// Exemplo utilizando a Thread com a classe download:
//			d1.start();
//			d2.start();
						
		}
		
		finally {
			finish();
		}
		
	
	}
}
