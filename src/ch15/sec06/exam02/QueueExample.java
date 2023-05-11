package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "김자바"));
		
		while(!messageQueue.isEmpty()) {
			Message mes = messageQueue.poll();
			
			switch (mes.command) {
			case "sendMail" :
				System.out.println(mes.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS" :
				System.out.println(mes.to + "님에게 SMS를 보냅니다");
				break;
			case "sendKakaotalk" :
				System.out.println(mes.to + "님에게 카카오톡을 보냅니다");
				break;


			}
		}
	}

}
