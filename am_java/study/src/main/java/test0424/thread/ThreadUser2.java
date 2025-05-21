package main.java.test0424.thread;

public class ThreadUser2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Timer timer = new Timer();
        Image image = new Image();
        counter.start();
        timer.start();
        image.start();
    }
}
