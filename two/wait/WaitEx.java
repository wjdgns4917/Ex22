package com.two.wait;

public class WaitEx {
	public static void main(String[] args) {
		WorkObj shareObj=new WorkObj();
		
		ThreadA threadA=new ThreadA(shareObj);
		ThreadB threadB=new ThreadB(shareObj);
		
		threadA.start();
		threadB.start();
	}
}
