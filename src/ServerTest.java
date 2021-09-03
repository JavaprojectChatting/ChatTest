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
 * 해야 할 기능
 * - 서버소켓 오픈
 * - 무한으로 클라이언트 받아 소켓 생성해 스레드에 담기
 * - 스레드로 클라이언트별로 메시지 받고 전체 클라이언트에 뿌리기
 */

public class ServerTest extends Thread{
	//유저확인 리스트
	//ArrayList<Socket> list = new ArrayList<Socket>(); 
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	//클라이언트 정보 담은 소켓
	Socket socket = null;
	
	PrintWriter writer;  ////////////////////////////////
	
	//생성자
	public ServerTest(Socket socket) {
		this.socket = socket; // 유저 socket 할당
		
		try {/////////////////////////////////////
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer); ////////////////////////////////

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		//list.add(socket); // 유저를 list에 추가

	}

	String name = null;  //클라이언트 이름 설정용
	boolean introduce = false;  //소개 확인용
	String text = null;  //클라이언트에서 받은값 저장용
	
	/*
	//start()메소드로 실행
	//스레드별(클라이언트별)로 개별적으로 실행하기위해 스레드로 작성
	public void run() {
		try {
			// 수신 stream - 클라이언트>서버
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			// 송신 stream - 서버>클라이언트
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); 
			
			// 연결완료 메시지 보내기 - 서버>클라이언트 
			writer.println("서버 연결 완료");
			writer.println("닉네임을 입력해주세요");
			//name = reader.readLine();
			//writer.println("당신의 이름은 "+name+"입니다.");
			
			//클라이언트가 메시지 송신시마다 수행
			while((text=reader.readLine()) != null) {  //클라이언트가 송신한 메시지가 있을경우 실행
				//처음에만 접속한 클라이언트 알림
				if(introduce == false) {
					name= text;  //
					writer.println(name + "님이 접속했습니다.");
					introduce = true;
				}
				
				//리스트 안의 모든 클라이언트에게 전송
				for(int i=0; i<list.size(); i++) {
					//리스트 안 클라이언트에 연결
					writer = new PrintWriter(list.get(i).getOutputStream());
					//해당 클라이언트에게 메시지 전송
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
		// 수신 stream - 클라이언트>서버
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			writer.println("서버 연결 완료. 닉네임을 입력해주세요.");
			writer.flush();
			name = reader.readLine();
			
			sendAll(name + "님이 접속했습니다.");
			
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				sendAll(name + ": "+str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally { //접속 종료시
			list.remove(writer);
			sendAll(name+"님이 접속종료했습니다.");
			try {
				socket.close();
			}catch (Exception ignored) {
			}
		}
	}
	
	//전체 전송
	private void sendAll(String str) {
		for(PrintWriter writer : list) {
			writer.println(str);
			writer.flush();
		}
	}
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
				
		try {
			int socketPort = 9006; //소켓포트번호
			serverSocket = new ServerSocket(socketPort);  //서버소켓 생성
		
			//서버소켓이 종료될 때까지 무한반복
			//클라이언트가 여러명일 경우 대비해 무한반복으로 작성해야 함
			while(true) {
				//서버에 클랑이언트 접속시 소켓 생성
				Socket socketuser = serverSocket.accept();
				//thread에 클라이언트정보를 담은 소켓을 넘겨줌
				Thread thread = new ServerTest(socketuser);
				//스레드 시작(run 실행)
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

