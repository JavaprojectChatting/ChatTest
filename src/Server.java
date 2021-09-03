/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread{
	public static void main(String[] args) {
		//유저확인 리스트
		ArrayList<Socket> list = new ArrayList<Socket>(); 
		
		//서버소켓
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		//서버소켓 생성
		serverSocket = new ServerSocket(9001);
		//클라이언트소켓
		socket = serverSocket.accept();
		
		public void run() {
			try {
				// 수신 stream - 클라이언트 -> 서버
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				// 송신 stream - 서버 -> 클라이언트
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			//서버소켓 생성
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			// 송수신 Stream
			
			//송수신 스레드 생성
			Thread senderThread = new SenderThread(socket);
			Thread receiverThread = new ReceiverThread(socket);
			//송수신 스레드 실행
			senderThread.start();
			receiverThread.start();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				serverSocket.close();  //서버소켓 닫기
			}catch (Exception ignored) {
			}
		}
		
	}
}
*/