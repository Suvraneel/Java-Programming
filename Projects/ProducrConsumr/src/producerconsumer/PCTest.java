package producerconsumer;
/*
 * @author 
 * Suvraneel Bhuin
 * T91/CSE/194032
 * Class Roll- 19
 */
public class PCTest {

	public static void main(String[] args) throws Exception {
		Queue q = new Queue(10);
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();
		
		p.join();
		c.join();
	}
}