package com.simplilearn.thread;

public class MainThreadUsingInterface implements Runnable{
    public static int count=0;
    
    public MainThreadUsingInterface() {
        
    }
    @Override
    public void run() {
        while(count<=10)
        {
            System.out.println("Exc Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Starting Main thread...");
        
        MainThreadUsingInterface main=new MainThreadUsingInterface();
        Thread m=new Thread(main);
        m.start();
        
        while(count<=10)
        {
            System.out.println("Main Thread "+ (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	
}
