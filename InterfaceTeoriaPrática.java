// Interface: contrato que todo animal deve seguir
interface Animal {
    void emitirSom();
    void mover();
}

// Classe abstrata: modelo base para veículos
abstract class Veiculo {
    String nome;

    Veiculo(String nome) {
        this.nome = nome;
    }

    abstract void transportar(); // cada veículo define como transporta

    void parar() {
        System.out.println(nome + " parou.");
    }
}

// Classe Cachorro (implementa Animal)
class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro corre feliz.");
    }
}

// Classe Gato (implementa Animal)
class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato anda silenciosamente.");
    }
}

// Classe Caminhão (herda de Veiculo)
class Caminhao extends Veiculo {
    Caminhao(String nome) {
        super(nome);
    }

    @Override
    void transportar() {
        System.out.println(nome + " está transportando cargas pesadas.");
    }
}

// Classe Avião (herda de Veiculo)
class Aviao extends Veiculo {
    Aviao(String nome) {
        super(nome);
    }

    @Override
    void transportar() {
        System.out.println(nome + " está transportando passageiros.");
    }
}

// Programa principal
public class Programa {
    public static void main(String[] args) {
        // Trabalhando com interface (contrato Animal)
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom(); 
        gato.emitirSom();     

        // Trabalhando com classe abstrata (modelo de veículos)
        Veiculo caminhao = new Caminhao("Caminhão Volvo");
        Veiculo aviao = new Aviao("Boeing 737");

        caminhao.transportar();
        aviao.transportar();
        aviao.parar();
    }
}



// Interface Animal → define o que todo animal deve fazer.
// Classe abstrata Veiculo → define um modelo base de veículos.
// Classes concretas que implementam/estendem as duas.
