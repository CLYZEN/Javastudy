package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// 두 정수 사이의 랜덤 값 구하는 공식 (start부터 n 까지 랜덤값)
		// 값 = (int) (Math.random() *n) + start;
		
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("선택번호 : ");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨번호 : ");
		
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		// 당첨여부
		Arrays.sort(selectNumber); // 배열  오름차순 정렬
		Arrays.sort(winningNumber); // 배열 오름차순 정렬
		System.out.print("당첨여부 : ");
		boolean result = Arrays.equals(selectNumber, winningNumber);
		if(result) {
			System.out.println("당첨!");
		} else {
			System.out.println("꽝 !");
		}
	}
}
