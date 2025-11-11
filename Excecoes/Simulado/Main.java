package Simulado;


import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
//		Gerente g1 = new Gerente("Adriel");
//		g1.exibirDados();
//		Vendedor v1 = new Vendedor("José");
//		v1.exibirDados();
		
	    ArrayList<Funcionario> funcionarios = new ArrayList<>();
        // Criando objetos
        funcionarios.add(new Gerente("Ana"));
        funcionarios.add(new Vendedor("Carlos"));
        funcionarios.add(new Vendedor("Marina"));
        // Exibindo os dados
        System.out.println("=== Folha de Pagamento ===");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
		
		
	}

}
