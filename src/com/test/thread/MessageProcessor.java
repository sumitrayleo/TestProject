package com.test.thread;

public class MessageProcessor implements Runnable {

    int message;

    public MessageProcessor(int message) {
        super();
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Message [Received] = " + message);
        respondToMessage();
        System.out.println(Thread.currentThread().getName() + "Message [Answered] = " + message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message = " + message);
        }
    }

}
