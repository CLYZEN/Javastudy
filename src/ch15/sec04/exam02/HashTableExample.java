package ch15.sec04.exam02;

import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// 1000개의 데이터 추가
				for(int i=1; i<=1000; i++) {					
					map.put(String.valueOf(i), i);
				}
			}
		};
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// 1000개의 데이터 추가
				for(int i=1001; i<=2000; i++) {					
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		// 쓰레드 실행
		threadA.start();
		threadB.start();
		
		try {
			// a와 b 스레드가 종료될 때 까지 메인 스레드를 기다리게 함
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			
		}
		
		int size = map.size();
		System.out.println(size);
	}
}
