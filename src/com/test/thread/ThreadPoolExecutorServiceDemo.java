package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        
        Runnable thread1 = new MessageProcessor(1);
        service.execute(thread1);
        
        Runnable thread2 = new MessageProcessor(2);
        service.execute(thread2);
        
        Runnable thread3 = new MessageProcessor(3);
        service.execute(thread3);
        
        Runnable thread4 = new MessageProcessor(4);
        service.execute(thread4);
        
        service.shutdown();
    }

}
