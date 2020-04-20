package com.two.sync;

public class SyncEx {
	public static void main(String[] args) {
		SharedBoard board=new SharedBoard();//������ ����������
		
		Thread th1=new StudentThread("AAA", board);
		Thread th2=new StudentThread("BBB", board);
		
		//������ ����
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
	//�����ǿ� 10������ ī����
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
		}
	}
}