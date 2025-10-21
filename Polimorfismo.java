package aula02;

public class FormaGeometrica {
	public void calcularArea(){
	}
}

package aula02;

public class Quadrado extends FormaGeometrica {
	
	
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do quadrado é de: " + lado * lado); 
    }

}
package aula02;

public class Triangulo extends FormaGeometrica{
	
	
	private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do triangulo é de: " + (base * altura) / 2); 
    }
	
}

package aula02;

public class Circulo extends FormaGeometrica {
	
	private double raio;
	
	
	public Circulo(double raio) {
		this.raio = raio;	
	}
	
	public void calcularArea(){
		
		 System.out.println("A área do circulo é de: " + (3.14 * (raio*raio))); 
	}


}


package aula02;

public class Main {

	public static void main(String[] args) {
	
		
		Quadrado q1 = new Quadrado(5);
		q1.calcularArea();
		
		Triangulo t1 = new Triangulo(3, 4);
		t1.calcularArea();
		
		Circulo c1 = new Circulo(5);
		c1.calcularArea();
		
	}

}


