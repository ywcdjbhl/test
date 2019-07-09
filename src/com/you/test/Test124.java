package com.you.test;

import java.util.Timer;
import java.util.TimerTask;

public class Test124 {
	Timer timer;
	public Test124(int time) {
		timer = new Timer();
		timer.schedule(new Test124_2(), time);
	}
	public static void main(String[] args) {
		new Test124(3000);
	}
}

class Test124_2 extends TimerTask {
	public void run() {
		System.out.println("执行定时任务");
	}
}
