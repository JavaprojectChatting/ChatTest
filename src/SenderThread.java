import java.io.BufferedReader;
import java.io.*;
import java.net.*;
import java.util.Scanner;

//메시지 송신하는 스레드, 클라이언트->서버
public class SenderThread extends Thread {
	// 소켓
	Socket socket;
	Scanner scanner = new Scanner(System.in); //
	
	SenderThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			// 수신 stream
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			// 송신 stream
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			// 계속해서 수신준비 (상대편 송신 기다림)
			while (true) {
				String str = reader.readLine();
				if (str.equals("bye"))
					break;
				writer.println(str);//수신 내용 작성 
				writer.flush();
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception ignored) {
				
			}
		}
	}
}
