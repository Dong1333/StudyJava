package org.practice.first;


// 멀티 스레드 확인 예제
public class Start6 extends Thread {
	static int share;
	
	public static void main(String[] args) {
		Start6 t1 = new Start6();
		Start6 t2 = new Start6();
		
		t1.start();
		t2.start();
	}
	public void run() {
		for(int count = 0; count < 10; count++) {
			System.out.println(share++);
			
			
			try {sleep(10000);}
			catch (InterruptedException e) {}
		}
	}

}
