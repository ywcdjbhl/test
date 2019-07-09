package com.you.test;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintStream;
public class Test258 {
	public static void main(String[] args) throws Exception {
		Test258LineReader reader = new Test258LineReader("G:/1.properties");
	}
}

class Test258LineReader {
	// ! # * 为注释,只有放在行首才有效   age #11 11不是注释
	// 只忽略行首的空格,行尾的空格算作值
	private InputStream in;
	public Test258LineReader(String file) {
		try {
			// 把文件内容全部读到输入流中
			this.in = new FileInputStream(file);	
			execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 每次用bs接收输入流的内容
	private byte[] bs = new byte[8192];
	private int bsIndex = 0;// bs的当前下标
	private int bsCount;// bs里读了多少字节
	private byte[] buff = new byte[10];// 这个一直使用,每读一对key value后,buffIndex就从零开始,覆盖上一次读的字节
	private int buffIndex = 0;// buff的当前下标
	private int buffLimit;// buff的长度
	private boolean skipWhitespace = true;
	private boolean isComment = false;// 是否是注释
	private boolean lastLoop = false;
	public void readTillChangeLine() throws IOException {
		// count为bs中有多少个字节是刚从输入流中读取的
		// 遍历bs,把有效的字符放入buff中
		while (bsIndex <= bsCount) {
			if (bsIndex == bsCount) {
				bsCount = in.read(bs);
				if (bsCount == -1) {
					// 输入流中的内容读完了,是最后一次循环
					buffLimit = 0;
					lastLoop = true;
					return;
				}
				bsIndex = 0;
			}
			byte b = bs[bsIndex];
			char c = (char) (b & 0xFF);
			if (skipWhitespace && (c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f')) {
				// 跳过行首的空格和换行符
				// bsIndex增加
				bsIndex++;
				continue;
			}
			if (skipWhitespace && (c == '!' || c == '#' || c == '*')) {
				skipWhitespace = false;
				isComment = true;
				bsIndex++;
			}
			if (c == '\r' || c == '\f' || c == '\n') {
				//行尾换行符
				// bsIndex增加,buffIndex归零
				bsIndex++;
				buffLimit = buffIndex;
				buffIndex = 0;
				skipWhitespace = true;// 跳过空格
				isComment = false;// 不是注释
				return;
			}
			if (isComment) {
				bsIndex++;
				continue;
			}
			skipWhitespace = false;
			buff[buffIndex] = bs[bsIndex];
			// bsIndex和buffIndex都增加
			buffIndex++;
			bsIndex++;
			if (buffIndex == buff.length) {
				// 扩容
				byte[] broadbuff = new byte[buff.length * 2];
				System.arraycopy(buff, 0, broadbuff, 0, buff.length);
				buff = broadbuff;
			}
		}
	}
	
	public void execute() throws IOException {
		PrintStream err = System.err;
		while (true) {
			readTillChangeLine();	
			String line = new String(buff, 0, buffLimit);
			err.println(line);
			int buffLimit = this.buffLimit;
			int shortkeylen = 0;// 可能的最短keylen
			int keylen = 0;
			int keyIndex = 0;
			boolean meetWhitespace = false;
			// 确定key的长度
			while (keylen < buffLimit) {
				byte b = buff[keyIndex];
				char c = (char) (b & 0xFF);
				if (c == ' ' || c == '\t') {
					// 遇到空格,shortkeylen,keylen不变,keyIndex++,继续向后扫描
					keyIndex++;
					meetWhitespace = true;
				} else if (c == '=' || c == ':') {
					// 遇到=或:,跳出循环,跳出之前shortkeylen=keylen
					shortkeylen = keylen;
					break;
				} else {
					// 遇到字符,是没有遇到过空格
					// 如果遇到过,kenIndex++,
					// 如果没有 kenIndex++,keylen++
					if (meetWhitespace) {
						keyIndex++;
						keylen = keyIndex;
					} else {
						shortkeylen++;
						keylen++;
						keyIndex++;
					}
				}
			}
			keylen = shortkeylen;
			if (keylen > 0) {
				// 没有key
				// 确定value的开始下标
				int valueStart = keylen + 1;
				while (valueStart < buffLimit) {
					byte b = buff[valueStart];
					char c = (char) (b & 0xff);
					if (c == ' ' || c == '\t' || c == '=' || c == ':') {
						valueStart++;
					} else {
						break;
					}
				}
				String key = new String(buff, 0, keylen);
				String value = new String(buff, valueStart, buffLimit - 1 - valueStart + 1);
				err.println("key=" + key + "$value=" + value + "&");
			}
			if (lastLoop) {
				break;
			}
		}
	}
}
