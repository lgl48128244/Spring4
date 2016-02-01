package socket.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;


public class Client {
	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket(7777);
		//String msg = "HI udp";
		//byte[] buf = msg.getBytes();
		//int len = msg.length();
		byte[] buf = conver(222.3333);
		int len = buf.length;
		DatagramPacket packet = new DatagramPacket(buf, len, new InetSocketAddress("localhost", 8888));
		client.send(packet);
		client.close();
	}

	public static byte[] conver(double num) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeDouble(num);
		byte[] data = bos.toByteArray();
		dos.close();
		bos.close();
		return data;
	}
}
