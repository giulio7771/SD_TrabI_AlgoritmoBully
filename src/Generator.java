
public class Generator extends Thread{
//This class generates the processes
	@Override
	public void start() {
		while(true) {
			Process p = new Process();
			p.start();
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
