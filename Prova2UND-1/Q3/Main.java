package Q3;

public class Main {
	
	
	public static void main(String[] args) throws TratarExcept {
		
	
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		
		
		try {
			c1.dividir(10, 0);
			c2.dividir(10, 5);
		}
		
		catch(TratarExcept e) {
			System.out.println(e.getMessage());
		}
		
		finally {
	
			System.out.println("Processo Finalizado!");
			
		}
		
		
		
	}

}
