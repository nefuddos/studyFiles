package com.threadtest;

public class ThreadTest2 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			if(i == 3) {
				ThreadTest2 instance = new ThreadTest2();
				new Thread(instance, "new thread1").start();
				new Thread(instance, "new thread2").start();
			}
		}
	}
}
