package com.you.test;

import java.io.PrintStream;
import java.util.Properties;

public class Test173 {
public static void main(String[] args) {
	PrintStream err = System.err;
	Properties props=System.getProperties(); //系统属性
    err.println("Java的运行环境版本："+props.getProperty("java.version"));
    err.println("Java的运行环境供应商："+props.getProperty("java.vendor"));
    err.println("Java供应商的URL："+props.getProperty("java.vendor.url"));
    err.println("Java的安装路径："+props.getProperty("java.home"));
    err.println("Java的虚拟机规范版本："+props.getProperty("java.vm.specification.version"));
    err.println("Java的虚拟机规范供应商："+props.getProperty("java.vm.specification.vendor"));
    err.println("Java的虚拟机规范名称："+props.getProperty("java.vm.specification.name"));
    err.println("Java的虚拟机实现版本："+props.getProperty("java.vm.version"));
    err.println("Java的虚拟机实现供应商："+props.getProperty("java.vm.vendor"));
    err.println("Java的虚拟机实现名称："+props.getProperty("java.vm.name"));
    err.println("Java运行时环境规范版本："+props.getProperty("java.specification.version"));
    err.println("Java运行时环境规范供应商："+props.getProperty("java.specification.vender"));
    err.println("Java运行时环境规范名称："+props.getProperty("java.specification.name"));
    err.println("Java的类格式版本号："+props.getProperty("java.class.version"));
    err.println("Java的类路径："+props.getProperty("java.class.path"));
    err.println("加载库时搜索的路径列表："+props.getProperty("java.library.path"));
    err.println("默认的临时文件路径："+props.getProperty("java.io.tmpdir"));
    err.println("一个或多个扩展目录的路径："+props.getProperty("java.ext.dirs"));
    err.println("操作系统的名称："+props.getProperty("os.name"));
    err.println("操作系统的构架："+props.getProperty("os.arch"));
    err.println("操作系统的版本："+props.getProperty("os.version"));
    err.println("文件分隔符："+props.getProperty("file.separator"));   //在 unix 系统中是＂／＂
    err.println("路径分隔符："+props.getProperty("path.separator"));   //在 unix 系统中是＂:＂
    err.println("行分隔符："+props.getProperty("line.separator"));   //在 unix 系统中是＂/n＂
    err.println("用户的账户名称："+props.getProperty("user.name"));
    err.println("用户的主目录："+props.getProperty("user.home"));
    err.println("用户的当前工作目录："+props.getProperty("user.dir")); 
    err.println("扩展类加载器加载路径：" + props.getProperty("java.ext.dirsr"));
}
}
