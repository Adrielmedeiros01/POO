package Thread;

public class Pong extends Thread{
	
	protected String pong;
	
	public Pong() {
		 this.pong = "pong";
	}
	
	@Override
	public void run() {
		try {
			for(int i = 1; i<=10;i++) {
				Thread.sleep(1000);
				System.out.println(this.pong);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Pong finalizado");
		}
	}
}
