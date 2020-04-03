package com.test.TestFileSize;

public class TestFileSize {
    public static void main(String[] args) {
        String str = "sdnfsdsfffffffff@#$%^¢ffffffffffffffffffff§Çfffff$fkjndfkjnfsjjjjjjjjjjjsss";
        
        System.out.println(validate(str));
        /*File file = new File("C:\\AEM\\author\\cq5-author-p4502.jar");

        if (file.exists()) {

            double bytes = file.length() / 1024;
            double megabytes = (bytes / 1024);

            System.out.println("megabytes : " + megabytes);
        } else {
            System.out.println("File does not exists!");
        }*/

    }
    
    private static boolean validate(final String systemLog) {
        System.out.println(systemLog.getBytes().length);
        return systemLog != null && (systemLog.getBytes().length / (1024 * 1024)) < 100;
    }
}
