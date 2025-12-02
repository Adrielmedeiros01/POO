package Thread;

public class MsgRepeat extends Thread{
	
	protected String msg;
	protected int repeat;
	
	public MsgRepeat(String msg, int repeat) {
		this.msg = msg;
		this.repeat = repeat;
	}
	@Override
	public void run() {
		try {
			for(int i=1; i<=repeat; i++) {
				Thread.sleep(1000);
				System.out.println(this.msg + " - " + i);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Processo finalizado...");
		}
	}
}
