package poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	     System.out.println("Bem vindo à IA on-line do IFPE.");
	     System.out.print("Digite seu prompt: ");
	     String prompt = in.nextLine();
	     IA ia = new IA();
	     
	     try {
	    	 System.out.println(ia.executarPrompt(prompt));
	     }

	     catch(Exception e) {
	    	 System.out.println("Falha de internet!");
	     }
	     
	    
	}
}
