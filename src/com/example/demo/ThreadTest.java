package com.example.demo;

public class ThreadTest extends Thread {

	/*- Thread 클래스를 상속 받는, 하위 스레드 클래스 생성
	- 하위 스레드 내에 run( )을 오버라이드 한다. run( )은 Thread가 실행되면 수행되는 곳이다.
	- Thread 객체를 생성해주고 start( ) 메소드로 Tread의 run( ) 메소드를 실행시켜준다.*/
	
	private static final String TAG = "TestThread";
	
	public ThreadTest(){
		//초기화
	}
	
	//override?
	// thread가 실행되면 수행되는 곳
	public void run(){
		
		int sec = 0;
		
		while(true){
			sec++;
			
			// 아래 코드가 없게 되면 5초 동안 쓰레드가 잠드는 일 없이 계속 수행됨.
			// (일시적 중지 없이)
			try{
				//thread 에게 수행시킬 동작 구현
				Thread.sleep(5000); //5초간 thread를 잠재운다.
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("경과된 시간 : "+Integer.toString(sec));
		}
	}
	
}
