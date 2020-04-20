package com.one.priority;

public class ThreadPriority {
	public static void main(String[] args) {
		A t1=new A();
		B t2=new B();
		System.out.println("t1.p : "+t1.getPriority());
		System.out.println("t2.p : "+t2.getPriority());
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		System.out.println("t1.p : "+t1.getPriority());
		System.out.println("t2.p : "+t2.getPriority());
		t1.start();
		t2.start();
	}
}
