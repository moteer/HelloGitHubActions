package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        while (true) {
            Thread.sleep(2 * 1000);
            System.out.println(String.format("%d seconds have passed ...", count++)); // test comment
        }
    }
}
