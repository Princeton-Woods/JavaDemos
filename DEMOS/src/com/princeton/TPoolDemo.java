package com.princeton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i  < 10; i++) {
			Runnable worker = new WorkerThread(" " + i);
			es.execute(worker);
		}
		es.shutdown();
		while(!es.isTerminated()) {
			
		}		
		System.out.println("Finished all threads");

	}

}
class WorkerThread implements Runnable{ 
	private String msg;
	
	public WorkerThread(String msg) {
		this.msg = msg;
	}
	public void run() {
		System.out.println();
		ProccessMsg();

	}
	private void ProccessMsg() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}