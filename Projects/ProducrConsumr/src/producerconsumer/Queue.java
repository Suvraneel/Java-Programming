package producerconsumer;

/**
 * This class also acts as the Monitor for Producer and Consumer.
 * 
 * @author 
 * Suvraneel Bhuin
 * T91/CSE/194032
 * Class Roll- 19
 *
 */
public class Queue {
	int size, inStock = 0;
	int arr[];
	
	public Queue(int size) {
		this.size = size;
		arr = new int[size];
	}

	int nextProduceIndex = size-1;
	int nextConsumerIndex = 0;
	
	boolean isEmpty() {
		return (inStock == 0);
	}
	
	boolean isFull() {
		return (size == inStock);
	}
	
	
	void produce(int n) throws Exception {
		if (!isFull()){
			nextProduceIndex += 1;
			nextProduceIndex %= size; 
			arr[nextProduceIndex]= n;
			System.out.println(n + " is produced at index " + nextProduceIndex);
			inStock++;
			}
		else
			System.out.println(" Queue is full");
	}
	
	void consume() throws Exception {
		if (!isEmpty()){
			System.out.println(arr[nextConsumerIndex] + " is consumed from index " + (nextConsumerIndex));
			nextConsumerIndex += 1;
			nextConsumerIndex %= size; 
			inStock--;
		}
		else
			System.out.println(" Out of Stock !");
	}				
}