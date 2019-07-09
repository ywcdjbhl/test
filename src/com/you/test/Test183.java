package com.you.test;

public class Test183 {
	public static void main(String[] args) {
		Test182 factory = new Test182();
		Test181 proxyService = new Test181(); 
		Test177_2 proxyed = new Test177_2();
		Object obj = factory.createProxy(proxyed, proxyService);
		System.out.println("生成代理对象=" + obj);
		System.out.println(obj);
		Test177_2 proxyer = (Test177_2)obj;
		proxyer.playBaseketBall(null, null);
		proxyer.playRoll();
		proxyer.playPoker();
		proxyer.playSki();
	}
}
