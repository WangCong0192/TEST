package CUMT.ISAC.WC.TEST;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class myTools {

	private static List<byte[]> list_used = new ArrayList<byte[]>();
//	private byte[] emptyBytes = { 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, (byte) 0x07,
//			0x2F };

	public static void setList_used(List<byte[]> list_used) {
		myTools.list_used = list_used;
	}

	/**
	 * 检测退出时是否仍有数据未保存,并提示操作。
	 * 
	 * @return 0 保存并退出 1 不保存退出 2 不保存不退出 -1 未检测到数据,可以退出
	 */
	public static int whetherSave() {
//		if (RealTimeChart.getTimeSeries().getItemCount() != 0) {
//			int message = JOptionPane.showConfirmDialog(null, "检测到有数据未保存，是否保存？  “是”，保存并退出；“否”，直接退出。", "提示信息",
//					JOptionPane.YES_NO_CANCEL_OPTION);
//			if (message == 0) {
//				saveAsFile();
//				return message;
//			} else if (message == 1) {
//				return message;
//			} else if (message == 2) {
//				return message;
//			}
//		}
		return -1;
	}

	/**
	 * 将图表List保存为文件，保存后清空
	 * 
	 * @return 返回是否保存成功标志
	 */

	public static boolean saveAsFile() {
//		if (wifiTools.getClient() != null) {
//			JFileChooser jf = new JFileChooser("D:\\");
//			jf.setDialogTitle("请选择保存数据的路径...");
//			
//			Date now = new Date(System.currentTimeMillis());
//			SimpleDateFormat format = new SimpleDateFormat("HH时mm分");
//			SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd ");
//			String date = format2.format(now);
//			String name = format.format(now);
//			jf.setSelectedFile(new File(date+name));
////			jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//			// 显示打开的文件对话框
//			if (jf.showSaveDialog(null)== JFileChooser.APPROVE_OPTION) {
////			File f = jf.getSelectedFile();// 使用文件类获取选择器选择的文件
////			String s = f.getAbsolutePath();// 返回路径名
////			JOptionPane.showMessageDialog(null, s, "标题", JOptionPane.WARNING_MESSAGE);
//				try {
//					File file1 = new File(jf.getCurrentDirectory()  + "\\" + jf.getName(jf.getSelectedFile()) + ".csv");
//
////					System.out.println(jf.getSelectedFile().getAbsolutePath());
////					System.out.println(jf.getName(jf.getSelectedFile()));
////					System.out.println(jf.getCurrentDirectory());
////					
////					System.out.println(file1.getAbsolutePath());
////					System.out.println(file1.getParentFile().getAbsolutePath());
//					
////					if (!file1.getParentFile().exists()) {
////						file1.getParentFile().mkdirs();
////						file1.createNewFile();
////					}
//					if(!file1.exists()) {
//						file1.createNewFile();
//					}
//					PrintWriter pw = new PrintWriter(file1);
//					pw.println("time,data");
//					for (int i = 0; i < wifiRecieve.getTimeList().size(); i++) {
//						pw.println(wifiRecieve.getTimeList().get(i) + "," + wifiRecieve.getDataList().get(i));
//					}
//					wifiRecieve.getTimeList().removeAll(wifiRecieve.getTimeList());
//					wifiRecieve.getDataList().removeAll(wifiRecieve.getDataList());
//					RealTimeChart.getTimeSeries().clear();
//					pw.close();
//					JOptionPane.showMessageDialog(null, "保存成功！","保存文件提示：",JOptionPane.PLAIN_MESSAGE);
//					return true;
//				} catch (FileNotFoundException e) {
//					JOptionPane.showMessageDialog(null, e.toString(), "文件保存错误！", JOptionPane.ERROR_MESSAGE);
//				} catch (IOException e) {
//					JOptionPane.showMessageDialog(null, e.toString(), "文件保存错误！", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		} else if (Serialport_1.mySerialPort != null) {
//			JFileChooser jf = new JFileChooser("D:\\");
//			jf.setDialogTitle("请选择保存数据的路径...");
//			
//			Date now = new Date(System.currentTimeMillis());
//			SimpleDateFormat format = new SimpleDateFormat("HH时mm分");
//			SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd ");
//			String date = format2.format(now);
//			String name = format.format(now);
//			jf.setSelectedFile(new File(date+name));
////			jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//			// 显示打开的文件对话框
//			if (jf.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
////				File f = jf.getSelectedFile();// 使用文件类获取选择器选择的文件
////				String s = f.getAbsolutePath();// 返回路径名
////				JOptionPane.showMessageDialog(null, s, "标题", JOptionPane.WARNING_MESSAGE);
//				try {
//					File file1 = new File(jf.getCurrentDirectory()  + "\\" + jf.getName(jf.getSelectedFile()) + ".csv");
//
////					System.out.println(jf.getCurrentDirectory());
////					System.out.println(file1.getAbsolutePath());
//					
//					if (!file1.getParentFile().exists()) {
//						file1.mkdirs();
//						file1.createNewFile();
//					}
//					if(!file1.exists()) {
//						file1.createNewFile();
//					}
//					PrintWriter pw = new PrintWriter(file1);
//					pw.println("time,data");
//					for (int i = 0; i < SerialListener.getTimeList().size(); i++) {
//						pw.println(SerialListener.getTimeList().get(i) + "," + SerialListener.getDataList().get(i));
//					}
//					SerialListener.getTimeList().removeAll(SerialListener.getTimeList());
//					SerialListener.getDataList().removeAll(SerialListener.getDataList());
//					RealTimeChart.getTimeSeries().clear();
//					pw.close();
//					JOptionPane.showMessageDialog(null, "保存成功！","保存文件提示：",JOptionPane.PLAIN_MESSAGE);
//					return true;
//				} catch (FileNotFoundException e) {
//					JOptionPane.showMessageDialog(null, e.toString(), "文件保存错误！", JOptionPane.ERROR_MESSAGE);
//				} catch (IOException e) {
//					JOptionPane.showMessageDialog(null, e.toString(), "文件保存错误！", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		}
		return false;
	}
	
	
	
	
	
	
	

	/**
	 * 按照协议计算 速度 byte数组
	 * 
	 * @param bytes
	 * @return
	 */
	public static double getSpeedData(byte[] bytes) {
		byte[] tempBytes = new byte[4];
		for (int i = 2; i < 6; i++) {
			tempBytes[i - 2] = bytes[i];
		}
		return bytesToFloat(tempBytes, 0);
	}

//	public static String getSpeedData(byte[] bytes) {
//		String[] stringTemp = new String[4];
//		String[] readString = new String[16];
//		for (int i = 0; i < bytes.length; i++) {
//			readString[i] = Integer.toHexString(bytes[i] & 0xFF);
//		}
//		for (int i = 2; !(readString[i].equals("55")); i++) {
//			stringTemp[i - 2] = readString[i];
//		}
//		stringTemp = reverse(stringTemp);
//		StringBuffer stringBuffer = new StringBuffer();
//		for (int i = 0; i < stringTemp.length; i++) {
//			stringBuffer = stringBuffer.append(stringTemp[i]);
//		}
////		直接转换为16进制数
//		int num = Integer.parseInt(stringBuffer.toString(), 16);
//		System.out.println(num);
//		return null;
//	}
//
//	public static String[] reverse(String[] strings) {
//		for (int start = 0, end = strings.length - 1; start < end; start++, end--) {
//			String temp = strings[end];
//			strings[end] = strings[start];
//			strings[start] = temp;
//		}
//		return strings;
//	}

	/**
	 * 按照协议计算 PID byte数组
	 * 
	 * @param P
	 * @param I
	 * @param D
	 * @return 符合协议的16进制下的PID参数
	 */
	public static byte[] getPIDByteArray(String P, String I, String D) {
		float P_float = Float.parseFloat(P);
		float I_float = Float.parseFloat(I);
		float D_float = Float.parseFloat(D);
		byte[] head = list_used.get(0);
		head = concat(head,
				concat(concat(floatToByteArray(P_float), floatToByteArray(I_float)), floatToByteArray(D_float)));
		byte[] foot = { getSumVerify(head), 0x2f };
		return concat(head, foot);

	}

	/**
	 * 按照协议计算 目标值 byte数组
	 * 
	 * @param aim
	 * @return 符合协议的目标值byte数组
	 */
	public static byte[] getAimByteArray(String aim) {
		byte[] head = list_used.get(1);
		byte[] empty = { 85, 85, 85, 85, 85, 85, 85, 85 };
		head = concat(concat(head, intToBytes(Integer.parseInt(aim))), empty);
		byte[] foot = { getSumVerify(head), (byte) 0x2f };
		return concat(head, foot);

	}

	/**
	 * 获取电机启动指令
	 * 
	 * @return 返回电机启动指令
	 */

	public static byte[] getMotorStartbytes() {
		return list_used.get(2);
	}

	/**
	 * 获取复位指令
	 * 
	 * @return
	 */

	public static byte[] getMotorResetbytes() {
		byte[] motorReset = { (byte) 0xAA, 0x09, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55, 0x55,
				(byte) 0x05, 0x2F };
		return motorReset;
	}

	/**
	 * 获取位置复位指令
	 * 
	 * @return 返回位置复位指令
	 */
	public static byte[] getPositionResetBytes() {
		return list_used.get(3);
	}

	/**
	 * 通讯协议计算 验证位 byte 要注意只能计算除去验证位和结束位的长度14的，和不去除验证位和结束位的长度16的数组
	 * 
	 * @param bytes 除去验证位和结束位的数组
	 * @return 通讯协议验证位
	 */
	public static byte getSumVerify(byte[] bytes) {
		byte b = 0x00;
		if (bytes.length == 14) {
			for (int i = 1; i < bytes.length; i++) {
				// System.out.println("readBuffer[+" + i + "]: " +
				// Integer.toHexString(readBuffer[i] & 0xFF) + " b: "
				// + Integer.toHexString(b & 0xFF));
				// 这个0xFF 是因为在进行int（32位）强制转换的时候 负数前面不是补0而是取反全部为f，所以与运算只保留后两位。
				bytes[i] = (byte) (bytes[i] & 0xFF);
				b = (byte) (b + bytes[i]);
			}
		} else if (bytes.length == 16) {
			for (int i = 1; i < bytes.length - 2; i++) {
				bytes[i] = (byte) (bytes[i] & 0xFF);
				b = (byte) (b + bytes[i]);
			}
		}
		return b;
	}

	/**
	 * int型转化为 byte数组
	 * 
	 * @param num 需要转化的int
	 * @return 转化后的byte数组
	 */
	public static byte[] intToBytes(int num) {

		byte[] bytes = new byte[4];
		bytes[3] = (byte) (num >> 24);
		bytes[2] = (byte) (num >> 16);
		bytes[1] = (byte) (num >> 8);
		bytes[0] = (byte) (num);
		return bytes;
	}

	/**
	 * 浮点转换为字节数组
	 * 
	 * @param f 需要转化的浮点数
	 * @return 转化后的byte数组
	 */
	public static byte[] floatToByteArray(float f) {

		// 把float转换为byte[]
		int fbit = Float.floatToIntBits(f);

		byte[] b = new byte[4];
		for (int i = 0; i < 4; i++) {
			b[i] = (byte) (fbit >> (24 - i * 8));
		}

		// 翻转数组
		int len = b.length;
		// 建立一个与源数组元素类型相同的数组
		byte[] dest = new byte[len];
		// 为了防止修改源数组，将源数组拷贝一份副本
		System.arraycopy(b, 0, dest, 0, len);
		byte temp;
		// 将顺位第i个与倒数第i个交换
		for (int i = 0; i < len / 2; ++i) {
			temp = dest[i];
			dest[i] = dest[len - i - 1];
			dest[len - i - 1] = temp;
		}

		return dest;

	}

	/**
	 * 拼接两个数组
	 * 
	 * @param a 拼接后在前的数组
	 * @param b 拼接后在后的数组
	 * @return 拼接后的数组
	 */

	public static byte[] concat(byte[] a, byte[] b) {

		byte[] c = new byte[a.length + b.length];

		System.arraycopy(a, 0, c, 0, a.length);

		System.arraycopy(b, 0, c, a.length, b.length);

		return c;

	}

	/**
	 * 以16进制打印byte数组
	 * 
	 * @param b
	 */
	public static void printHexString(byte[] b) {
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() % 2 == 1) {
				hex = '0' + hex;
			}
			System.out.print(hex.toUpperCase() + " ");
		}
		System.out.println();
	}

	/**
	 * 将输入数组转化为整型数
	 * 
	 * @param bytes 输入的数组
	 * @return 转化后的整型
	 */
	public static int byteToInt(byte[] bytes) {
		int int1 = bytes[0] & 0xff;
		int int2 = (bytes[1] & 0xff) << 8;
		int int3 = (bytes[2] & 0xff) << 16;
		int int4 = (bytes[3] & 0xff) << 24;
		return int1 | int2 | int3 | int4;
	}

	/**
	 * 字节转换为浮点
	 * 
	 * @param b     字节（至少4个字节）
	 * @param index 开始位置
	 * @return
	 */
	public static float bytesToFloat(byte[] b, int index) {
		int l;
		l = b[index + 0];
		l &= 0xff;
		l |= ((long) b[index + 1] << 8);
		l &= 0xffff;
		l |= ((long) b[index + 2] << 16);
		l &= 0xffffff;
		l |= ((long) b[index + 3] << 24);
		return Float.intBitsToFloat(l);
	}
}
