package producerconsumer;
/*
 * @author 
 * Suvraneel Bhuin
 * T91/CSE/194032
 * Class Roll- 19
 */
import java.util.Random;

public class Producer extends Thread{

	Queue q;
	
	public Producer(Queue q) {
		this.q = q;
	}
	
	@Override
	public void run() {
		//Continuously produce items at random interval
		Random random = new Random();
		synchronized(this) {
			while(true) {
				try {
					q.produce((Math.abs(random.nextInt()))%1000);
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}