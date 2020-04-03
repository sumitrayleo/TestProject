package com.test.fileprocessing;

class MyAutoCloseable implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Close All resources");
    }

}

public class AutoCloseableTest {

    public static void main(String[] args) {
        try (MyAutoCloseable var = new MyAutoCloseable();) {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
