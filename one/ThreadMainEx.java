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
		long id=Thread.currentThread().getId(); //������ ID���
		String name=Thread.currentThread().getName(); //������ �̸� ���
		int priority=Thread.currentThread().getPriority(); //������ �켱���� �� ���
		
		Thread.State s=Thread.currentThread().getState();//������ ���� �� ���
		
		System.out.println("���� ������ �̸� = "+name);
		System.out.println("���� ������ ID = "+id);
		System.out.println("���� ������ �켱���� �� = "+priority);
		System.out.println("���� ������ ���� = "+s);
		
		ThreadA1 a1=new ThreadA1();
		long ida1=a1.getId();
		String namea1=a1.getName();
		System.out.println("���� ������ �̸� a1 = "+namea1);
		System.out.println("���� ������ IDa1 = "+ida1);
		
		ThreadA1 a2=new ThreadA1();
		long ida2=a2.getId();
		String namea2=a2.getName();
		System.out.println("���� ������ �̸� a2 = "+namea2);
		System.out.println("���� ������ IDa2 = "+ida2);
	}
}
