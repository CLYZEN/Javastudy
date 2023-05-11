package sec15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		// <Key, Value> 타입 명시
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("size : " + map.size()); // Key가 같은데이터 중복 저장 불가

		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + value);

		System.out.println("====================");
		// 전체 데이터 출력 방법 1

		System.out.println("====================");
		// 데이터 삭제
		map.remove("홍길동"); // key로 데이터 삭제

		// 키를 전부 가져온다
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) { // 키의 갯수만큼 반복해준다.
			String k = keyIterator.next(); // 키를 하나씩 가져온다.
			int v = map.get(k);
			System.out.println(k + ":" + v);
		}
		System.out.println("====================");

	}
}
