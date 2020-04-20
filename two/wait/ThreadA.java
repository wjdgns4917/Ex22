package com.two.wait;

public class ThreadA extends Thread {
	private WorkObj workObj;
	public ThreadA(WorkObj workObj) {
		this.workObj=workObj;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObj.methodA();
		}
	}
}
