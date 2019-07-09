package com.you.test;
import java.io.PrintStream;
public class Test226 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		char MIN_HIGH_SURROGATE = '\uD800';
		err.println("MIN_HIGH_SURROGATE=" + (int)MIN_HIGH_SURROGATE);
		char MAX_HIGH_SURROGATE = '\uDBFF';
		err.println("MAX_HIGH_SURROGATE=" + (int)MAX_HIGH_SURROGATE);
		char MIN_LOW_SURROGATE = '\uDC00';
		err.println("MIN_LOW_SURROGATE=" + (int)MIN_LOW_SURROGATE);
		char MAX_LOW_SURROGATE = '\uDFFF';
		err.println("MAX_LOW_SURROGATE=" + (int)MAX_LOW_SURROGATE);
		char MIN_SUPPLEMENTARY_CODE_POINT = (char)65536;
		err.println("MIN_SUPPLEMENTARY_CODE_POINT=" + 65536);
				
	}
	
}
