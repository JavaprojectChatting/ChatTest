import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		// 家南 积己
		Socket socket = null;
		
		try {
			// 192.168.0.11 server IP
			socket = new Socket("192.168.0.11",9002);
			
			// 价荐脚 Stream
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			writer.println("Hello, Server");
			writer.flush();
			
			String str = reader.readLine();
			System.out.println(str);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception ignored) {
				
			}
		}
	}

}
