package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		
		// 인코딩
		byte[] arr1 = data.getBytes(); // 문자열 => byte 배열로 변경 (UTF-8로 인코딩)
		//byte[] arr1 = data.getBytes("EUC-KR"); // 문자열 => byte 배열로 변경 (EUC-KR로 인코딩)
		System.out.println("arr1" + Arrays.toString(arr1));
		
		// 디코딩
		String str1 = new String(arr1); // byte 배열 => 문자열로 변경
		// String str1 = new String(arr1, "EUC-KR"); // byte 배열 => 문자열로 변경 EUC-KR
		System.out.println("str1 : " + str1);
		
	}
}
