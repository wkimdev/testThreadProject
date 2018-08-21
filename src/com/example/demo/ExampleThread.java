package com.example.demo;

// thread Join 예제
public class ExampleThread extends Thread {
	
	private static final String TAG = "ExampleThread";
	
	private int threadNum = 0;
	
	public ExampleThread(int threadNum) {
		// 초기화 작업
		this.threadNum = threadNum;
	}

	public void run() {
		System.out.println("시작된 쓰레드"+ Integer.toString(threadNum));
		try{
			// thread가 수행할 동작을 구현
			Thread.sleep(1000); // 1초간 Thread를 잠재운다.
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("종료된 쓰레드"+Integer.toString(threadNum));
	}
}
