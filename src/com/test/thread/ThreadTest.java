package com.test.thread;

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println("Start Thread - A");
        MyTask task = new MyTask("Thread-A");
        task.start();
        
        System.out.println("Start Thread - B");
        MyTask task2 = new MyTask("Thread-B");
        task2.start();
    }
}

class MyTask extends Thread {
    
    private String taskName;
    
    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    public void run(){
        Thread.currentThread().setName(taskName);
        for(int i = 0; i < 1000; i++){
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
        }
    }
}