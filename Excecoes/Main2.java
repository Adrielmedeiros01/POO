package Excecoes;

public class Main{

	public static void valor(int v) throws MinhaExcept {
		
		if(v >= 100) {
			throw new MinhaExcept("Erro! Digite um número menor que 100!");
		}	
	}
	
	public static void soma(int num1, int num2) throws MinhaExcept {
		
		
		int soma = num1 + num2;
		
		if(soma >= 100) {
			throw new MinhaExcept("Centena");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			valor(50);
			soma(100,10);
		}
		
		catch(MinhaExcept e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getName());
			
		}
		
		catch(NullPointerException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Processo finalizado com sucesso!");
		}
		
	}
	

}
