package com.one;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	private JLabel label;
	
	class Mythread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				
				label.setText(i+"");
			}
		}
	}
	public CountDownTest() {
		setTitle("CountDown");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label=new JLabel("Start");
		label.setFont(new Font("impact", Font.BOLD, 100));
		add(label);
		Mythread mt=new Mythread();
		mt.start();
//		(new Mythread()).start();
		
		setSize(300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new CountDownTest();
	}
}
