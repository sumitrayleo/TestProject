package com.test.thread;

public class ThreadTest3 {

    public static void main(String[] args) {
        System.out.println("Start Thread - A");
        Thread thread = new Thread(() -> {
                for(int i = 0; i < 100; i++){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
                }
            });
        thread.start();
        
        System.out.println("Start Thread - B");
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
                }
            }
            
        });
        thread2.start();
    }
}
