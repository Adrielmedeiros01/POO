package meuprojeto;
import java.util.Scanner;
public class Empresa {
	
//	Melhore código criando uma classe com atributos: nome, salário e bônus, além de um método para calcular
//	o salário final. No main, crie um objeto da classe, preencha os dados e mostre o resultado chamando o método.
//
//	import java.util.Scanner;
//
//	public class Programa {
//	   public static void main(String[] args) {
//	      Scanner sc = new Scanner(System.in);
//	      System.out.print("Digite o nome do funcionário: ");
//	      String nome = sc.nextLine();
//	      System.out.print("Digite o salário do funcionário: ");
//	      double salario = sc.nextDouble();
//	      System.out.print("Digite o bônus (em %): ");
//	      double bonus = sc.nextDouble();
//	      double salarioFinal = salario + (salario * bonus / 100);
//	      System.out.println("Funcionário: " + nome);
//	      System.out.println("Salário final: R$ " + salarioFinal);
//	   }
//	}
	
	
	public String nome;
	public double salario;
	public double bonus;
	
	
	public Empresa(String nome, double salario, double bonus) {
		this.nome = nome;
		this.salario = salario;
		this.bonus = bonus;
	}
	
	
	
	public void salarioFinal() {
		System.out.println("O Salário final é R$"+ (this.salario+(this.salario *this.bonus)/100) );
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Digite o nome do funcionário: ");
	    String nome = sc.nextLine();
	    System.out.print("Digite o salário do funcionário: ");
	    double salario = sc.nextDouble();
	    System.out.print("Digite o bônus (em %): ");
	    double bonus = sc.nextDouble();
		
		Empresa e1 = new Empresa(nome,salario,bonus);
		
		e1.salarioFinal();
		
	}

	
	
	
	
}
