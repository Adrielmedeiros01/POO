package ProvaFinalPOO;

public class Caixa<T> {
	
	private T conteudo;
	
	public void guardar(T item) {
		this.conteudo = item;
	}
	
	public T abrir() {
		return this.conteudo;
	}
	

}


package ProvaFinalPOO;
import java.util.Random;

public class TarefaDownload extends Thread{

	private String nomeFicheiro;

    public TarefaDownload(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public void iniciarDownload() {
        System.out.println(">>> Iniciando download: " + nomeFicheiro);
        try {
            for (int porcentagem = 1; porcentagem <= 100; porcentagem++) {
                // Simula variação na velocidade da rede
                int tempoEspera = new Random().nextInt(500) + 100; 
                Thread.sleep(tempoEspera);

                // Imprime o progresso a cada 20%
                if (porcentagem % 20 == 0) {
                    System.out.println("A descarregar " + nomeFicheiro + ": " + porcentagem + "% concluído.");
                }
            }
            System.out.println("✅ Download de " + nomeFicheiro + " FINALIZADO!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void run() {
    	try {
    		Thread.sleep(50);
    		iniciarDownload();
    	}   	
    	catch(InterruptedException e){
    		e.printStackTrace();
    	}
    }
}




package ProvaFinalPOO;

public class Main {

	public static void main(String[] args) {
		
//		Caixa<String> c1 = new Caixa<>();
//		c1.guardar("Documento importante!");
//		Caixa<Integer> c2 = new Caixa<>();
//		c2.guardar(12345);
//		System.out.println("Valor da caixa c1: "+ c1.abrir());
//		System.out.println("Valor da caixa c2: "+ c2.abrir());
		
		
		 TarefaDownload t1 = new TarefaDownload("Relatorio_Final.pdf");
	     TarefaDownload t2 = new TarefaDownload("Video_Ferias.mp4");
	     TarefaDownload t3 = new TarefaDownload("Instalador_Jogo.exe");

	     t1.start();
	     t2.start();
	     t3.start();
		

	}

}

