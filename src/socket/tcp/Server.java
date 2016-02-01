package socket.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		OutputStream os = socket.getOutputStream();//输出流
		String msg = "HI Scoket";
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os, "utf-8"));
		//bw.write(msg);
		//bw.newLine();
		//bw.flush();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF(msg);

	}
}
