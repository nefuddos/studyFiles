package com.threadtest;

public class ThreadTest1 extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			if(i == 3) {
				new ThreadTest1().start();
				new ThreadTest1().start();
			}
		}
	}
}
