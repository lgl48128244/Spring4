package socket.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

	public static void main(String[] args) throws IOException {
		DatagramSocket server = new DatagramSocket(8888);
		byte[] data = new byte[1024];
		DatagramPacket socket = new DatagramPacket(data, data.length);
		server.receive(socket);
		int len = socket.getLength();
		byte[] b = socket.getData();
		double d = conver(b);
		//System.out.println(new String(b, 0, len));
		System.out.println(d);
		server.close();
	}

	public static double conver(byte[] data) throws IOException {
		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		DataInputStream dis = new DataInputStream(bis);
		dis.close();
		bis.close();
		return dis.readDouble();
	}
}
