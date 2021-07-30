import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			//서버소켓 생성
			serverSocket = new ServerSocket(9002);
			//클라이언트소켓 생성
			socket = serverSocket.accept();
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
