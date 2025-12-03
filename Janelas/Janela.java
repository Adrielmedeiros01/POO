package Janela;


// Dica para saber como importar se a IDE não oferecer:
//Passe o mouse sobre o erro segurando cntrl e clicle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Swing componentes - PESQUISAR!
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JTextArea;



public class Main {

	public static void main(String[] args) {
		
		//Criando Objetos/Componentes:
		JFrame janela = new JFrame("My first window in JAVA");
				
		
		JLabel label = new JLabel("Digite algum texto na área abaixo:"); //Este é meu primeiro Label en Java;
		label.setBounds(0, 10, 200, 30);
		
		
		JTextArea txtar = new JTextArea();
		txtar.setBounds(0, 40, 200, 30);		
		
		JButton btn = new JButton("Submit"); //my First Buttom;
		btn.setBounds(0, 80, 200, 30);
		
		//Adicionando uma função ao botão quando for clicado;[:
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Essa menasagem saíra no console");
				String valor = txtar.getText();
				System.out.printf("Texto digitado: %S", valor); // Observe que tem que ser o "printf";
				JLabel labelBtn = new JLabel(valor);
				labelBtn.setBounds(0, 120, 200, 30);
			}
			
		});
		
		
		// Adicionando componentes:
		janela.add(label);
		janela.add(txtar);
		janela.add(btn);
		
		//Configurações da janela:
		janela.setBounds(0, 0, 400, 600); // Posição do plano catersiano e width e heigth de qqr componente na tela;
		janela.setLayout(null); // Obriga você definir a largura, altura e cordenadas de onde você deseja que seu componente esteja;
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para encerrar o executável corretamente;
		janela.setVisible(true); // Exibir a janela;
		
		
		
		
	}

}
