package com.one.priority;

public class A extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print("-");
		}
	}
}
