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
			System.out.println("������ : "+i);
		}
	}
}

public class JoinEx {
	public static void main(String[] args) {
		SumVal sumVal=new SumVal();
//		sumVal.sum=1000;
//		sumVal.setSum(1000); //����
//		//��������
//		System.out.println(sumVal.getSum());
		
		//SumVal���� ������� �����ϴ� �հ� ���
		sumVal.start();
		
		try {
//			sumVal.join();
			sumVal.join(0,500);
		} catch (InterruptedException e) {}
		
		System.out.println("�հ� : "+sumVal.getSum());
		
	}
}
