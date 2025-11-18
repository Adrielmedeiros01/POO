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
		
		try {
			
			helloworld();
			c1.contar();
			c2.contar();
		}
		
		finally {
			finish();
		}
		
	
	}
}

