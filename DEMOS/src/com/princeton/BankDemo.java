package com.princeton;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		DepositThread dt = new DepositThread(b);
		WithdrawThread wt = new WithdrawThread(b);
		
		dt.start();
		wt.start();
		//same for withdraw
	}

}
//
class Bank {
	int balance = 1000000;
	synchronized void withdraw(int amount) {
		if(balance < amount) {
			System.out.println("balance insufficient ");
		
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Withdraw Completed");
	}
	synchronized void Deposit(int amount) {
		System.out.println("Processing....");
		balance += amount;
		System.out.println("deposit completed");
		notify();
	}
}
//
class DepositThread extends Thread{
	Bank bank;
	public DepositThread(Bank bank){
		this.bank = bank;
	}
	public void run(){
		bank.Deposit(10000);
	}
}
//
class WithdrawThread extends Thread{
	Bank bank;
	public WithdrawThread(Bank bank) {
		this.bank = bank;
	}
	public void run() {
		bank.withdraw(10000);
	}
}
//Can also use a synchronize block 
//only do this if you want to sync a specific block of code not an entire function
	//synchronized(this) {
	//	for( int i = 0; i < 10; i ++) {
	//		
	//	}
	//}