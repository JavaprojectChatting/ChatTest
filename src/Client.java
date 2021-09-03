
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		// 소켓 생성
		Socket socket = null;
		
		try {
			// 192.168.0.11 server IP
			socket = new Socket("192.168.0.5",9006);
			
			//송수신 스레드 생성
			Thread senderThread = new SenderThread(socket);  //클라이언트->서버
			Thread receiverThread = new ReceiverThread(socket);  //서버->클라이언트
			
			//송수신 스레드 실행
			senderThread.start();
			receiverThread.start();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
