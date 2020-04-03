package com.test.thread;

public class ThreadTest2 {

    public static void main(String[] args) {
        System.out.println("Start Thread - A");
        Thread thread = new Thread(new MyTask2("Thread-A"));
        thread.start();
        
        System.out.println("Start Thread - B");
        Thread thread2 = new Thread(new MyTask2("Thread-B"));
        thread2.start();
    }
}

class MyTask2 implements Runnable {
    
    private String taskName;
    
    public MyTask2(String taskName) {
        this.taskName = taskName;
    }

    public void run(){
        Thread.currentThread().setName(taskName);
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
        }
    }
}