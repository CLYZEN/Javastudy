package ch12.sec11.exam02;

import java.lang.reflect.*;

public class ReflectionExample {
	public static void main(String[] args) {
		Class clazz = Car.class; // 클래스 객체

		System.out.println("[생성자정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName());
		}

		System.out.println("[필드정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}

		System.out.println("[메소드정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
