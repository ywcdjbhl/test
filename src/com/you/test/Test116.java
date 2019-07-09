package com.you.test;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Test116 {
	PrintStream err = System.err;
	public void run(Class<?> clazz) {
		 StringBuffer method = new StringBuffer();
	        String br = "\n";

	        Method[] methods = clazz.getMethods();
	        for(Method m : methods){
	            method
	            .append("   @Override").append(br)
	            .append("   public ").append(m.getReturnType()).append(" ").append(m.getName()).append("() {").append(br)
	            .append("       try {").append(br)
	            .append("           Method md = ").append(clazz.getName()).append(".class.getMethod(\"").append(m.getName()).append("\");").append(br)
	            .append("           invo.invoke(this,md);").append(br)
	            .append("       } catch(Exception e) {").append(br)
	            .append("           e.printStackTrace();").append(br)
	            .append("       }").append(br)
	            .append("   }").append(br).append(br);
	        }
	        
	        StringBuffer codeSrc = new StringBuffer();
	        codeSrc.append("package com.you.test;").append(br).append(br)
	                .append("import java.lang.reflect.Method;").append(br).append(br)
	                .append("public class $Proxy1 implements ").append(clazz.getName()).append(" {").append(br)
	                .append("   public $Proxy1(InvocationService invo) {").append(br)
	                .append("       this.invo = invo;").append(br)
	                .append("   }").append(br)
	                .append("   com.you.test.InvocationService invo;").append(br)
	                .append(method).append(br)
	                .append("}");
	        err.println(codeSrc.toString());
	        File file = new File("D://workspace_test51/test/src/com/you/test/$Proxy1.java");
	        try {
	        	file.createNewFile();	
	        	Writer out = new FileWriter(file);
		        out.write(codeSrc.toString());
		        out.flush();
		        out.close();
		        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		        err.println(compiler);
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	        
	}
	
	public static void main(String[] args) {
		Test116 test = new Test116();
		test.run(Test114_2.class);
	}
}
