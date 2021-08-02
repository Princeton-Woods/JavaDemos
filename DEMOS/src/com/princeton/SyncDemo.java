package com.princeton;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table tab = new Table();

		//t.PrintTable(7);
		
		MyThread th1 = new MyThread(tab);
		MyThread th2 = new MyThread(tab);
		
		th1.start();
		th2.start();
	}

}
class Table{ 
	
	public synchronized void PrintTable(int number) {
		for(int i = 0; i  < 15; i++) {
			
			System.out.println(number + " x " + number*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class MyThread extends Thread{ 
	Table table;
	public MyThread(Table table) {
		this.table = table;
	}
	public void run() {
		table.PrintTable(5);
	}
	
}
class MyThread2 extends Thread{ 
	Table table;
	public MyThread2(Table table) {
		this.table = table;
	}
	public void run() {
		table.PrintTable(500);
	}
	
}

	
//	private String msg;
//	
//	public WorkerThread(String msg) {
//		this.msg = msg;
//	}
//	public void run() {
//		System.out.println();
//		ProccessMsg();
//
//	}
//	private void ProccessMsg() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}

