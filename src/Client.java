
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		// ���� ����
		Socket socket = null;
		
		try {
			// 192.168.0.11 server IP
			socket = new Socket("192.168.0.5",9006);
			
			//�ۼ��� ������ ����
			Thread senderThread = new SenderThread(socket);  //Ŭ���̾�Ʈ->����
			Thread receiverThread = new ReceiverThread(socket);  //����->Ŭ���̾�Ʈ
			
			//�ۼ��� ������ ����
			senderThread.start();
			receiverThread.start();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
