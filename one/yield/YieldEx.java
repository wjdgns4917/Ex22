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
				System.out.println("AAA 작업중");
			}else {
				Thread.yield();
			}
		}
		System.out.println("Thread AAA종료");
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
				System.out.println("BBB 작업중");
			}else {
				Thread.yield();
			}
		}
		System.out.println("Thread BBB종료");
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
