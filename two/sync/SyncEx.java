package com.two.sync;

public class SyncEx {
	public static void main(String[] args) {
		SharedBoard board=new SharedBoard();//집계판 공유데이터
		
		Thread th1=new StudentThread("AAA", board);
		Thread th2=new StudentThread("BBB", board);
		
		//쓰레드 실행
		th1.start();
		th2.start();
	}
}
class SharedBoard{
	private int sum=0;
	public synchronized void add() {
		int n=sum;
		Thread.yield();
		n+=10;
		sum=n;
		System.out.println(Thread.currentThread().getName()+" : "+sum);
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread{
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board=board;
	}
	//집계판에 10번접근 카운팅
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
		}
	}
}