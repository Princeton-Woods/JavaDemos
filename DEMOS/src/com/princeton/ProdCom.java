package com.princeton;

public class ProdCom {

	public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        p.start();
        c.start();
	}

}
class Company {
    int item;
    boolean flag = false;
    synchronized void produce(int item) throws InterruptedException {
        if (flag) { wait();  }
        this.item = item;
        System.out.println("Produced: " + this.item);
        flag = true;
        notify();
    }

    synchronized int consume() throws InterruptedException {
        if (!flag) {  wait();  }
        System.out.println("Consumer: " + item);
        flag = false;
        notify();
        return this.item;
    }
}

class Producer extends Thread {
    Company company;
    Producer(Company company) { this.company = company;  }
    public void run() {
        int i = 1;
        try {
            this.company.produce(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    Company company;
    Consumer(Company company) { this.company = company;   }
    public void run() {
        int i=1;
        try {
            this.company.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

