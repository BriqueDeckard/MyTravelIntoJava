package behavioral.active_object;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class MyAbstractActiveObject {
	// A Queue that additionally supports operations that wait for the queue to become non-empty when retrieving an
	// element, and wait for space to become available in the queue when storing an element.
	private BlockingQueue<Runnable> requests;

	public String getName() {
		return name;
	}

	private String name;

	private Thread thread;

	public MyAbstractActiveObject(String name) {
		this.name = name;
		this.requests = new LinkedBlockingQueue<Runnable>();
		thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						// take --> Retrieves and removes the head of this queue,
						// waiting if necessary until an element becomes available.
						requests.take().run();
					} catch (InterruptedException e) {
						System.err.println(e.getMessage());
					}
				}
			}
		});
		thread.start();
	}

	public void eat() throws InterruptedException {
		requests.put(new Runnable() {
			             @Override
			             public void run() {
				             System.out.println(getName() + " is eating");
				             System.out.println(getName() + " has finished eating");
			             }
		             }
		);
	}

	public void roam() throws InterruptedException {
		requests.put(new Runnable() {
			@Override
			public void run() {
				System.out.println(getName() + " has started to roam");
			}
		});
	}


}
