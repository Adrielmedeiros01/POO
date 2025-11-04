package poo;

public class Main {

	public static void main(String[] args) {

		try {
			System.out.println("Esse Bloco será exeultado como o bloco Main");
		}
		
		catch(Exception e) {
			// captura o erro e trataremos esse erro..
			System.out.println("Ocorreu um erro!");
			System.out.println("Tipo da exceção: " + e.getClass().getName());
			System.out.println("Mensagem: " + e.getMessage());
		}
		
		finally {
			System.out.println("Esse bloco sempre será execultado quando finalizar o cógido...");
			System.out.println("Processo finalizado...");
		}	
		
	}
}
