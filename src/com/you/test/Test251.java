package com.you.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Reader;

public class Test251 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("G://1.properties");
			Test251LineReader lineReader = new Test251LineReader(in);	
			lineReader.readLine();	
			char[] cs = lineReader.lineBuf;
			
			
//			char[] linebuff = lineReader.lineBuf;
//			String s = "";
//			for (int i = 0; i < linebuff.length; i++) {
//				s = s + linebuff[i];
//			}
//			PrintStream err = System.err;
//			err.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Test251LineReader {
    public Test251LineReader(InputStream inStream) {
        this.inStream = inStream;
        inByteBuf = new byte[8192];
    }

    public Test251LineReader(Reader reader) {
        this.reader = reader;
        inCharBuf = new char[8192];
    }

    byte[] inByteBuf;
    char[] inCharBuf;
    char[] lineBuf = new char[1024];
    int inLimit = 0;
    int inOff = 0;
    InputStream inStream;
    Reader reader;

    int readLine() throws IOException {
        int len = 0;
        char c = 0;

        boolean skipWhiteSpace = true;
        boolean isCommentLine = false;
        boolean isNewLine = true;
        boolean appendedLineBegin = false;
        boolean precedingBackslash = false;
        boolean skipLF = false;

        while (true) {
            if (inOff >= inLimit) {
                inLimit = (inStream==null)?reader.read(inCharBuf)
                                          :inStream.read(inByteBuf);
                inOff = 0;
                if (inLimit <= 0) {
                    if (len == 0 || isCommentLine) {
                        return -1;
                    }
                    if (precedingBackslash) {
                        len--;
                    }
                    return len;
                }
            }
            if (inStream != null) {
                //The line below is equivalent to calling a
                //ISO8859-1 decoder.
                c = (char) (0xff & inByteBuf[inOff++]);
            } else {
                c = inCharBuf[inOff++];
            }
            if (skipLF) {
                skipLF = false;
                if (c == '\n') {
                    continue;
                }
            }
            if (skipWhiteSpace) {
                if (c == ' ' || c == '\t' || c == '\f') {
                    continue;
                }
                if (!appendedLineBegin && (c == '\r' || c == '\n')) {
                    continue;
                }
                skipWhiteSpace = false;
                appendedLineBegin = false;
            }
            if (isNewLine) {
                isNewLine = false;
                if (c == '#' || c == '!') {
                    isCommentLine = true;
                    continue;
                }
            }

            if (c != '\n' && c != '\r') {
                lineBuf[len++] = c;
                if (len == lineBuf.length) {
                    int newLength = lineBuf.length * 2;
                    if (newLength < 0) {
                        newLength = Integer.MAX_VALUE;
                    }
                    char[] buf = new char[newLength];
                    System.arraycopy(lineBuf, 0, buf, 0, lineBuf.length);
                    lineBuf = buf;
                }
                //flip the preceding backslash flag
                if (c == '\\') {
                    precedingBackslash = !precedingBackslash;
                } else {
                    precedingBackslash = false;
                }
            }
            else {
                // reached EOL
                if (isCommentLine || len == 0) {
                    isCommentLine = false;
                    isNewLine = true;
                    skipWhiteSpace = true;
                    len = 0;
                    continue;
                }
                if (inOff >= inLimit) {
                    inLimit = (inStream==null)
                              ?reader.read(inCharBuf)
                              :inStream.read(inByteBuf);
                    inOff = 0;
                    if (inLimit <= 0) {
                        if (precedingBackslash) {
                            len--;
                        }
                        return len;
                    }
                }
                if (precedingBackslash) {
                    len -= 1;
                    //skip the leading whitespace characters in following line
                    skipWhiteSpace = true;
                    appendedLineBegin = true;
                    precedingBackslash = false;
                    if (c == '\r') {
                        skipLF = true;
                    }
                } else {
                    return len;
                }
            }
        }
    }
}
