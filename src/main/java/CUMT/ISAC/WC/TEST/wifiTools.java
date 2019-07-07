package CUMT.ISAC.WC.TEST;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class wifiTools {
	private static Socket client = null;
	private static PrintStream sendStream = null;
	private static InputStream recieveStream = null;
	private static byte[] bytes = new byte[16];
	
	public static InputStream getRecieveStream() {
		return recieveStream;
	}
	
	public static Socket getClient() {
		return client;
	}
	
	/**
	 * 创建TCP连接
	 */
	public static void connect_wifi() {
		try {
			client = new Socket("192.168.1.1", 8899);
			// 获取Socket的输出流，用来发送数据到服务端
			sendStream = new PrintStream(client.getOutputStream());
			// 获取Socket的输入流，用来接收从服务端发送过来的数据
			recieveStream = client.getInputStream();
		} catch (UnknownHostException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "TCP连接出错", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "TCP连接出错", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * 关闭TCP连接
	 */

	public static void close_wifi() {
		if (client != null) {
			// 如果构造函数建立起了连接，则关闭套接字，如果没有建立起连接，自然不用关闭
			try {
				client.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, e.toString(), "关闭TCP连接出错", JOptionPane.ERROR_MESSAGE);
			} // 只关闭socket，其关联的输入输出流也会被关闭
		}
	}

	/**
	 * 向TCP服务器发送数据
	 */

	public static void send_wifi(byte[] bytes) {
		try {
			sendStream.write(bytes);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "wifi发送出错", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * 接收TCP服务器发来的数据
	 */

	public static byte[] recieve_wifi() {
		int len = -1;
		try {
			len = recieveStream.read(bytes);
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		if (len != 16) {
			System.out.println("未读取到16字节数据,读取出" + len + "字节");
		}
//		myTools.printHexString(bytes);
		return bytes;
	}

}// 类结束
