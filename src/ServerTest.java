import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * �ؾ� �� ���
 * - �������� ����
 * - �������� Ŭ���̾�Ʈ �޾� ���� ������ �����忡 ���
 * - ������� Ŭ���̾�Ʈ���� �޽��� �ް� ��ü Ŭ���̾�Ʈ�� �Ѹ���
 */

public class ServerTest extends Thread{
	//����Ȯ�� ����Ʈ
	//ArrayList<Socket> list = new ArrayList<Socket>(); 
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	//Ŭ���̾�Ʈ ���� ���� ����
	Socket socket = null;
	
	PrintWriter writer;  ////////////////////////////////
	
	//������
	public ServerTest(Socket socket) {
		this.socket = socket; // ���� socket �Ҵ�
		
		try {/////////////////////////////////////
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer); ////////////////////////////////

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		//list.add(socket); // ������ list�� �߰�

	}

	String name = null;  //Ŭ���̾�Ʈ �̸� ������
	boolean introduce = false;  //�Ұ� Ȯ�ο�
	String text = null;  //Ŭ���̾�Ʈ���� ������ �����
	
	/*
	//start()�޼ҵ�� ����
	//�����庰(Ŭ���̾�Ʈ��)�� ���������� �����ϱ����� ������� �ۼ�
	public void run() {
		try {
			// ���� stream - Ŭ���̾�Ʈ>����
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			// �۽� stream - ����>Ŭ���̾�Ʈ
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); 
			
			// ����Ϸ� �޽��� ������ - ����>Ŭ���̾�Ʈ 
			writer.println("���� ���� �Ϸ�");
			writer.println("�г����� �Է����ּ���");
			//name = reader.readLine();
			//writer.println("����� �̸��� "+name+"�Դϴ�.");
			
			//Ŭ���̾�Ʈ�� �޽��� �۽Žø��� ����
			while((text=reader.readLine()) != null) {  //Ŭ���̾�Ʈ�� �۽��� �޽����� ������� ����
				//ó������ ������ Ŭ���̾�Ʈ �˸�
				if(introduce == false) {
					name= text;  //
					writer.println(name + "���� �����߽��ϴ�.");
					introduce = true;
				}
				
				//����Ʈ ���� ��� Ŭ���̾�Ʈ���� ����
				for(int i=0; i<list.size(); i++) {
					//����Ʈ �� Ŭ���̾�Ʈ�� ����
					writer = new PrintWriter(list.get(i).getOutputStream());
					//�ش� Ŭ���̾�Ʈ���� �޽��� ����
					writer.println(name + ":"+text); 
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	*/
	public void run() {
		// ���� stream - Ŭ���̾�Ʈ>����
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			writer.println("���� ���� �Ϸ�. �г����� �Է����ּ���.");
			writer.flush();
			name = reader.readLine();
			
			sendAll(name + "���� �����߽��ϴ�.");
			
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				sendAll(name + ": "+str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally { //���� �����
			list.remove(writer);
			sendAll(name+"���� ���������߽��ϴ�.");
			try {
				socket.close();
			}catch (Exception ignored) {
			}
		}
	}
	
	//��ü ����
	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
				
		try {
			int socketPort = 9006; //������Ʈ��ȣ
			serverSocket = new ServerSocket(socketPort);  //�������� ����
		
			//���������� ����� ������ ���ѹݺ�
			//Ŭ���̾�Ʈ�� �������� ��� ����� ���ѹݺ����� �ۼ��ؾ� ��
			while(true) {
				//������ Ŭ���̾�Ʈ ���ӽ� ���� ����
				Socket socketuser = serverSocket.accept();
				//thread�� Ŭ���̾�Ʈ������ ���� ������ �Ѱ���
				Thread thread = new ServerTest(socketuser);
				//������ ����(run ����)
				thread.start(); 
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();
			}catch (Exception ignored) {
			}
		}
	}


}

