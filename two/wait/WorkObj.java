package com.two.wait;

public class WorkObj {
	public synchronized void methodA() {
		System.out.println("Th a methodA() ����");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	public synchronized void methodB() {
		System.out.println("Th a methodB() ����");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
