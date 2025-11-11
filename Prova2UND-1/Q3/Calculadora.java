package Q3;

public class Calculadora{

	public static double dividir(double a, double b) throws TratarExcept  {
		if(b == 0) {
			throw new TratarExcept("Divisão por zero não é permitida!");
		}
		else {
			return a / b;
		}
		
	}
	
}
