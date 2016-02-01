package socket.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 8888);
		InputStream is = client.getInputStream();
		//BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
		//String enco = br.readLine();
		//System.out.println(enco);
		//br.close();
		DataInputStream dis = new DataInputStream(is);
		String ench = dis.readUTF();
		System.out.println(ench);
	}
}
