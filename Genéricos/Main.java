package aula2511;

public class Main {
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
	public static void main(String[] args) {
		try {
			helloworld();
			
			
			Par<String> p1 = new Par<>("Hello", "World!");
			System.out.println(p1.getPrimeiro());
			System.out.println(p1.getSegundo());
			
			Par<Integer> p2 = new Par<>(1, 2);
			System.out.println(p2.getPrimeiro());
			System.out.println(p2.getSegundo());
			
			
			
			
			
			
		}
		finally {
			finish();
		}
	}
}
