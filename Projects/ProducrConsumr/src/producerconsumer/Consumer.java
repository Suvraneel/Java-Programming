package producerconsumer;
/*
 * @author 
 * Suvraneel Bhuin
 * T91/CSE/194032
 * Class Roll- 19
 */
public class Consumer extends Thread{

	Queue q;
	
	public Consumer(Queue q) {
		this.q = q;
	}
	
	@Override
	public void run() {
		//Continuously consume items at random interval
		synchronized(this) {
			while(true) {
				try {
					q.consume();
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}