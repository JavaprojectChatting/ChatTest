import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

//�޽��� �����ϴ� ������
public class ReceiverThread extends Thread{
	//����
	Socket socket;
	ReceiverThread(Socket socket){
		this.socket = socket;
	}
	//������ ����
	public void run() {
		try {
			//�Է½�Ʈ�� ��ü
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String str = reader.readLine();  //���ŵ� ������ �о ����
				if(str==null) break;  //���ŵ� ������ ���� ���
				System.out.println("����>"+str);  //���ŵ� ������ ���
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
