package com.one;

class ThreadA1 extends Thread{
	@Override
	public void run() {
		System.out.println("A1A1");
	}
}
class ThreadA2 extends Thread{
	@Override
	public void run() {
		System.out.println("A2A2");
	}
}
public class ThreadMainEx {
	public static void main(String[] args) {
		long id=Thread.currentThread().getId(); //스레드 ID얻기
		String name=Thread.currentThread().getName(); //스레드 이름 얻기
		int priority=Thread.currentThread().getPriority(); //스레드 우선수위 값 얻기
		
		Thread.State s=Thread.currentThread().getState();//스레드 상태 값 얻기
		
		System.out.println("현재 스레드 이름 = "+name);
		System.out.println("현재 스레드 ID = "+id);
		System.out.println("현재 스레드 우선순위 값 = "+priority);
		System.out.println("현재 스레드 상태 = "+s);
		
		ThreadA1 a1=new ThreadA1();
		long ida1=a1.getId();
		String namea1=a1.getName();
		System.out.println("현재 스레드 이름 a1 = "+namea1);
		System.out.println("현재 스레드 IDa1 = "+ida1);
		
		ThreadA1 a2=new ThreadA1();
		long ida2=a2.getId();
		String namea2=a2.getName();
		System.out.println("현재 스레드 이름 a2 = "+namea2);
		System.out.println("현재 스레드 IDa2 = "+ida2);
	}
}
