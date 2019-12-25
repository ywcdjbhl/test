package com.you.test;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// 线程池的东西我不会

/**
 * 思享的ProcessTimer
 *
 * 类
 * RegisteredTask implements Runnable
 * GeneralTaskCallback
 * ProcessTimer
 * TaskRegistryRepository
 *
 *
 * 方法
 * ProcessTimer.scheduleRegisteredTask
 *
 * Redis存的是ZSet
 * key是room_task value是{type}_{roomId}_{uid}_{liveType} score是毫秒数
 */

public class Test588 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        executor.schedule(new Test589(), 5, TimeUnit.SECONDS);
    }
}
