import java.io.BufferedReader;
import java.io.*;
import java.net.*;

public class SenderThread extends Thread {
	// ����
	Socket socket;
	SenderThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			// ���� stream
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			// �۽� stream
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			// ����ؼ� �����غ� (����� �۽� ��ٸ�)
			while (true) {
				String str = reader.readLine();
				if (str.equals("bye"))
					break;
				writer.println(str);//���� ���� �ۼ�
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
