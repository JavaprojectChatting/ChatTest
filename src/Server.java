import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			//�������� ����
			serverSocket = new ServerSocket(9002);
			//Ŭ���̾�Ʈ���� ����
			socket = serverSocket.accept();
			//�ۼ��� ������ ����
			Thread senderThread = new SenderThread(socket);
			Thread receiverThread = new ReceiverThread(socket);
			//�ۼ��� ������ ����
			senderThread.start();
			receiverThread.start();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				serverSocket.close();  //�������� �ݱ�
			}catch (Exception ignored) {
			}
		}
	}
}
