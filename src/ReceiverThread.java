import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

//메시지 수신하는 스레드
public class ReceiverThread extends Thread{
	//소켓
	Socket socket;
	ReceiverThread(Socket socket){
		this.socket = socket;
	}
	//스레드 실행
	public void run() {
		try {
			//입력스트림 객체
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {
				String str = reader.readLine();  //수신된 데이터 읽어서 리턴
				if(str==null) break;  //수신된 데이터 없을 경우
				System.out.println("수신>"+str);  //수신된 데이터 출력
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
