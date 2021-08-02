package com.princeton;

public class DeadLocks {
	public static void main(String[] args) {
	        final String r1 = "Resource 1";
	        final String r2 = "Resource 2";

	        Thread t1 = new Thread() {
	            public void run() {
	                synchronized (r1) {
	                    System.out.println("Thread 1: locked resource 1");
	                    try {
	                        Thread.sleep(500);
	                    } catch (InterruptedException ex) {
	                        ex.printStackTrace();
	                    }
	                    synchronized (r2){
	                        System.out.println("Thread 1: locked resource 2");
	                    }
	                }
	            }
	        };
	        Thread t2 = new Thread() {
	            public void run() {
	                synchronized (r2){
	                    System.out.println("Thread 2: locked resource 2");
	                    try {
	                        Thread.sleep(500);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                    synchronized (r1){
	                        System.out.println("Thread 2: locked resource 1");
	                    }
	                }
	            }
	        };

	        t1.start();
	        t2.start();
    }
}


