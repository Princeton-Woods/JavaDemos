package com.princeton;

public class ThreadingPrac {

	public static void main(String[] args) {
		
		MultiThreadDemo td1 = new MultiThreadDemo();
		MultiThreadDemo td2 = new MultiThreadDemo();
		td1.start();
		td2.start();
		
		
		td1.setPriority(Thread.MIN_PRIORITY); // Can also pass in Thread.NORM_PRIORITY
		td2.setPriority(Thread.MAX_PRIORITY);
		
		//td1.run();
		//td2.run();
		//td1.join();
		
		//no context switching and will cause the fucntion to be treated as a normal object
		td1.setName("Princeton");
		System.out.println(td1.getName());

//		Thread t1 = new Thread(td);
//		t1.start();
	}

}
class MultiThreadDemo extends Thread{
	public void run() {
		System.out.println("thread is running...");
		for(int i = 0; i < 10; i++) {
			//Sleep must be surrounded by a try catch
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("running thread priority is " + Thread.currentThread().getPriority());
	}
}
//Thread function:
//	run() - perform action for a thread
//	start()	- used to start a newly created thread
//	sleep()
//	join() - will wait for thread to die
//	getName()
//	setName()
//	setPriority()
//	getPriority()
//	stop()
//	resume()

//Thread life cycle
// new --> runnable --> running --> non-runnable (blocked) --> terminated
//life cycle controlled by JVM