package com.one.yield;

class ThreadA extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while (!stop) {
			if (work) {
				try {
					sleep(200);
				} catch (InterruptedException e) {}
				System.out.println("AAA �۾���");
			}else {
				Thread.yield();
			}
		}
		System.out.println("Thread AAA����");
	}
}
class ThreadB extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while (!stop) {
			if (work) {
				try {
					sleep(200);
				} catch (InterruptedException e) {}
				System.out.println("BBB �۾���");
			}else {
				Thread.yield();
			}
		}
		System.out.println("Thread BBB����");
	}
}
public class YieldEx {
	public static void main(String[] args) {
		ThreadA threadA=new ThreadA();
		ThreadB threadB=new ThreadB();
		
		threadA.start();
		threadB.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("=========================");
		threadA.work=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("=========================");
		threadA.work=true;
		threadB.work=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("=========================");
		threadA.work=true;
		threadB.work=true;
		
	}
}
