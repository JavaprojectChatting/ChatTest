/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread{
	public static void main(String[] args) {
		//����Ȯ�� ����Ʈ
		ArrayList<Socket> list = new ArrayList<Socket>(); 
		
		//��������
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		//�������� ����
		serverSocket = new ServerSocket(9001);
		//Ŭ���̾�Ʈ����
		socket = serverSocket.accept();
		
		public void run() {
			try {
				// ���� stream - Ŭ���̾�Ʈ -> ����
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				// �۽� stream - ���� -> Ŭ���̾�Ʈ
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			//�������� ����
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			// �ۼ��� Stream
			
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
*/