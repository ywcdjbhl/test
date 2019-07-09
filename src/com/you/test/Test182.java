package com.you.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
/**
 *生成代理对象的类,工厂类 
 *
 */
public class Test182 {
	public Object createProxy(Object obj, InvocationService invo) {
		PrintStream out = System.err;
		Class<?> clazz = obj.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		StringBuffer buffer = new StringBuffer();
		for (Method method : methods) {
			int modifyer = method.getModifiers();
			out.println("修饰符:" + modifyer);
			if (modifyer == 1) {// public
//				buffer.append("@Override\n");
				buffer.append("public ");
			} else if (modifyer == 2) {//private 
				continue;
			} else if (modifyer == 4) {// protected
//				buffer.append("@Override\n");
				buffer.append("protected ");
			}else {
//				buffer.append("@Override\n");
			}
			//  返回值类型
			Class<?> clazzReturnType = method.getReturnType();
			out.println("返回值类型:" + clazzReturnType.getName());
			buffer.append(clazzReturnType.getName()).append(" ");
			out.println("方法名:" + method.getName());
			buffer.append(method.getName()).append("(");
			Class<?>[] paramclazzs = method.getParameterTypes();
			String paramTypeStr = "";
			String paramNameStr = "";
			for (int i = 0; i < paramclazzs.length; i++) {
				Class<?> paramclazz = paramclazzs[i];
				String paramType = paramclazz.getName();
				String simpleName = paramclazz.getSimpleName();
				out.println("参数类型:" + paramType);
				buffer.append(paramType).append(" ");
				out.println("参数类型短名:" + simpleName);
				out.println("参数变量名:" + simpleName + "_" + i);
				buffer.append(simpleName + "_" + i);
				paramTypeStr = paramTypeStr + paramType + ".class";
				paramNameStr = paramNameStr + simpleName + "_" + i;
				if (i != paramclazzs.length - 1) {
					buffer.append(", ");
					paramTypeStr += ','; 
					paramNameStr += ", ";
				}
			}
			if (paramTypeStr.length() > 0) {
				paramTypeStr = ", "+ paramTypeStr;
			}
			if (paramNameStr.length() > 0) {
				paramNameStr = ", " + paramNameStr;
			}
			buffer.append(") {\n");
			// 方法体
			// 得到被代理对象的对应方法名称的方法
			// try catch
			buffer.append("try {\n");
			buffer.append("Method met = obj.getClass().getDeclaredMethod( "+ "\""+ method.getName()+"\"" + paramTypeStr +");\n");
			buffer.append("this.invo.daili(obj, met " + paramNameStr +");\n");
			buffer.append("} catch (Exception e) {\n");
			buffer.append("e.printStackTrace();");
			buffer.append("}\n");
			if (!"void".equals(clazzReturnType.getName())) {
				// 有返回值
				boolean isboolean = isbooleanNativeType(clazzReturnType.getName());
				if (isboolean) {
					buffer.append("return false;\n");
				}
				boolean isNotbooleanNative = isNotbooleanNativeType(clazzReturnType.getName());
				if (isNotbooleanNative) {
					buffer.append("return 0;\n");
				}
				if (!isboolean && !isNotbooleanNative) {
					buffer.append("return null;\n");
				}
			}
			buffer.append("}\n\n");
		}
		StringBuffer buffer2 = new StringBuffer();
		Package packag = clazz.getPackage();
		if (packag != null) {
			buffer2.append("package " + packag.getName() + ';' + '\n' + '\n');	
		}
		buffer2.append("import java.lang.reflect.Method;\n");
		buffer2.append("public class " + clazz.getSimpleName() + "Proxy extends com.you.test.Test177_2"+ " {\n\n");
		// invoservice
		buffer2.append("private InvocationService invo;\n");
		// 被代理对象
		buffer2.append("private Object obj;\n");
		buffer2.append("public " + clazz.getSimpleName() + "Proxy(Object obj2, InvocationService invo2) {\n" );
		buffer2.append("this.invo = invo2;\n");
		buffer2.append("this.obj = obj2;\n");
		buffer2.append("}\n");
		buffer2.append(buffer);
		buffer2.append('}');
		out.println(buffer2);
		// 工作目录
		String userdir = System.getProperty("user.dir");
		String filepath = "";
		if (packag == null) {
			filepath = userdir + "\\src\\" + clazz.getSimpleName() + "Proxy.java";
		} else {
			filepath = userdir + "\\src\\" + packag.getName() + '/' + clazz.getSimpleName() + "Proxy.java";
		}
		filepath = filepath.replace(".", "/");
		filepath = filepath.replace("Proxy/java", "Proxy.java");
		out.println("文件生成地址=" + filepath);
		File file = new File(filepath);
		try {
			boolean result = file.createNewFile();
			out.println("文件生成结果=" + result);
			OutputStream ops = new FileOutputStream(file);
			ops.write(buffer2.toString().getBytes());
			ops.flush();
			ops.close();
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);  
	        Iterable<?> units = fileMgr.getJavaFileObjects(filepath);  
	        CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, (Iterable<? extends JavaFileObject>) units);  
	        t.call();  
	        fileMgr.close();
	        // 在classes里写.class
	        File classFile = new File(userdir + "/src/com/you/test/" + clazz.getSimpleName() + "Proxy.class");
	        File classFile2 = new File(userdir + "/WebContent/WEB-INF/classes/com/you/test/" + clazz.getSimpleName() + "Proxy.class");
	        result = classFile2.createNewFile();
	        out.println("复制.class文件结果:" + result);
	        InputStream in = new FileInputStream(classFile);
	        OutputStream ops2 = new FileOutputStream(classFile2);
	        while (true) {
	        	int i = in.read();
	        	if (i == -1) {
	        		break;
	        	}
	        	ops2.write(i);
	        }
	        URL url = new URL("file://" + userdir + "/src/");
	        out.println("加载" + url);
	        URL[] urls = new URL[1];
	        urls[0] = url;
	        URLClassLoader loader = new URLClassLoader(urls);
	        Class<?> proxyClazz = loader.loadClass(clazz.getName() + "Proxy");
	        Constructor con = proxyClazz.getConstructor(Object.class, InvocationService.class);
	        Object proxy = con.newInstance(obj, invo);
	        return proxy;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean isNotbooleanNativeType(String typeName) {
		if ("int".equals(typeName)
				|| "double".equals(typeName)
				|| "float".equals(typeName)
				|| "char".equals(typeName)
				|| "byte".equals(typeName)
				|| "short".equals(typeName)
				|| "long".equals(typeName)) {
			return true;
		}
		return false;
	}
	
	public boolean isbooleanNativeType(String typeName) {
		if ("boolean".equals(typeName)) {
			return true;
		}
		return false;
	}
}