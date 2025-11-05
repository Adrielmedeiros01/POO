package poo;

public class FalhaException extends Exception{
	
		public FalhaException() {
			super();
			System.out.println("Falha na conexão!");
		}
	
}


package poo;

public class IA {
	
	 public String executarPrompt(String prompt) throws FalhaException{
	        double numAleatorio = Math.random();
	        boolean falhaConexaoInternet = (numAleatorio < 0.5) ? true : false;
	        
	        if(falhaConexaoInternet == true) {
	        	throw new FalhaException();
	        }
	        return "Que pergunta inteligente, de acordo com meus conhecimentos...";
	    }
}
