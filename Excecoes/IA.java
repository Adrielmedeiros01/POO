package poo;

public class IA {
	
	 public String executarPrompt(String prompt) throws Exception{
	        double numAleatorio = Math.random();
	        boolean falhaConexaoInternet = (numAleatorio < 0.5) ? true : false;
	        
	        if(falhaConexaoInternet == true) {
	        	throw new Exception();
	        }
	        
	        return "Que pergunta inteligente, de acordo com meus conhecimentos...";
	    }
}
