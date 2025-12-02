package Thread;

public class Ping extends Thread{
	
	protected String ping;
	
	
	public Ping() {
		this.ping = "ping";
	}
	
	
	@Override
	public void run() {
		try {
			for(int i = 1; i<=10;i++) {
				Thread.sleep(1000);
				System.out.println(this.ping);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Ping finalizado");
		}
	}
}
