package com.example.demo;

public class ThreadMain {
	
	static ExampleThread thread;
	
	//thread 수행 Main
	public static void main(String[] args) {
		
		// 쓰레드 사용 예제 1 : 타이머
		//ThreadTest thread = new ThreadTest();
		// 쓰레드 사용 예제 2 : Join
		// ?
		System.out.println("메인 쓰레드 시작 : ");
		for(int i = 0; i <= 3; i++){
			thread = new ExampleThread(i);
			thread.start();
		}
		
		try{
			thread.join();
		}catch(InterruptedException e){
			
		}
		
		System.out.println("메인 쓰레드 종료, ");
		

	}
}
