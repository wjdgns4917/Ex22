package com.one;

class MyRunable implements Runnable{
	String name;
	
	public MyRunable(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+" : "+i);
		}
		
	}
	
}

public class RunThread {
	public static void main(String[] args) {
//		MyRunable t1=new MyRunable("Seoul");
//		MyRunable t2=new MyRunable("서울");
		Thread t1=new Thread(new MyRunable("Seoul"));
		Thread t2=new Thread(new MyRunable("서울"));
		
		t1.start();
		t2.start();
		
	}
}
