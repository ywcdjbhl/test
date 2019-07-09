package com.you.test;
import java.io.PrintStream;
public class Test300 {
	public static void main(String[] args) {
		PrintStream err = System.err;
		for (int i = 0; i < 40; i++) {
			err.println("LOLO" + i + ",");
		}
		err.println("-------------------");
		Test300_2[] tests = Test300_2.values();
		for (Test300_2 test : tests) {
			err.println(test.ordinal() + "       " + test.mask);
		}
	} 
}
enum Test300_2 {
	LOLO0,
	LOLO1,
	LOLO2,
	LOLO3,
	LOLO4,
	LOLO5,
	LOLO6,
	LOLO7,
	LOLO8,
	LOLO9,
	LOLO10,
	LOLO11,
	LOLO12,
	LOLO13,
	LOLO14,
	LOLO15,
	LOLO16,
	LOLO17,
	LOLO18,
	LOLO19,
	LOLO20,
	LOLO21,
	LOLO22,
	LOLO23,
	LOLO24,
	LOLO25,
	LOLO26,
	LOLO27,
	LOLO28,
	LOLO29,
	LOLO30,
	LOLO31,
	LOLO32,
	LOLO33,
	LOLO34,
	LOLO35,
	LOLO36,
	LOLO37,
	LOLO38,
	LOLO39;
	int mask;
	Test300_2() {
		mask = (1 << ordinal());
	}
}
