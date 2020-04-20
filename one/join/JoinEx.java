package com.one.join;

class SumVal extends Thread{
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum=sum+i;
//			sum+=i;
			System.out.println("쓰레드 : "+i);
		}
	}
}

public class JoinEx {
	public static void main(String[] args) {
		SumVal sumVal=new SumVal();
//		sumVal.sum=1000;
//		sumVal.setSum(1000); //세팅
//		//가져오기
//		System.out.println(sumVal.getSum());
		
		//SumVal에서 쓰레드로 동작하는 합계 출력
		sumVal.start();
		
		try {
//			sumVal.join();
			sumVal.join(0,500);
		} catch (InterruptedException e) {}
		
		System.out.println("합계 : "+sumVal.getSum());
		
	}
}
