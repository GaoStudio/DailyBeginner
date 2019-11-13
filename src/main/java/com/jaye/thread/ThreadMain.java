package com.jaye.thread;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-12-19 14:02
 * Email: gaoweivf@aliyun.com
 * Description:
 **/
class Thread1 extends Thread {
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
        }
    }
}

class Runnable1 implements Runnable {
    private String name;

    public Runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
        }
    }
}

class MyThreadPrinter2 implements Runnable {
    private String name;
    private Object prev;
    private Object self;
    public void print(){
        System.out.println(Thread.currentThread().getName());
    }
    public MyThreadPrinter2(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }
    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;

                    self.notify();
                }
                if(count>0){
                    try {
                        prev.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
        System.out.println("线程"+this.name+"结束");
    }
}

class ThreadWait extends Thread{
    private String name;
    public ThreadWait(String name){
        this.name = name;
    }
    @Override
    public void run() {
        super.run();
        synchronized (this){
            System.out.println(name+"Thread Obj notify");
            //notify();
        }
    }
}

class ThreadNotify extends Thread{
    private Object objectLock;
    public ThreadNotify(Object objectLock){
        this.objectLock = objectLock;
    }
    @Override
    public void run() {
        super.run();
        synchronized (this.objectLock){
            System.out.println(Thread.currentThread().getName()+"wait...");
            try {
                this.objectLock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"continue");
        }
    }
}
abstract class Bank{
    public abstract void setCount(int count);
    public abstract int getCount();
}
class ShareBank extends Bank{
    private int count;
    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }
}
class LocalBank extends Bank{
    private ThreadLocal<Integer> count = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public void setCount(int count) {
        this.count.set(count);
    }

    public int getCount() {
        return this.count.get();
    }
}
class BankRunnable implements Runnable{
    private Bank bank;
    public BankRunnable(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            int count  = bank.getCount()+1;
            if(count==5){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            bank.setCount(count);
            System.out.println(Thread.currentThread().getName()+"::::::"+bank.getCount());
        }
    }
}
public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
       /* Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        MyThreadPrinter2 pa = new MyThreadPrinter2("A", c, a);
        MyThreadPrinter2 pb = new MyThreadPrinter2("B", a, b);
        MyThreadPrinter2 pc = new MyThreadPrinter2("C", b, c);

        pa.print();
        pb.print();
        pc.print();*/
        Bank bank = new LocalBank();
        new Thread(new BankRunnable(bank)).start();
        new Thread(new BankRunnable(bank)).start();
       /* ThreadWait threadWait1 = new ThreadWait("t1");
        ThreadWait threadWait2 = new ThreadWait("t2");

        synchronized (threadWait1){
            System.out.println(Thread.currentThread().getName()+"ThreadWait start");
            threadWait1.start();
            threadWait2.start();
            // 主线程等待t1通过notify()唤醒。
            System.out.println(Thread.currentThread().getName()+" wait()");
            threadWait1.wait();

            System.out.println(Thread.currentThread().getName()+" continue");
        }*/
      /*  Object o = new Object();
        ThreadNotify threadNotify1 = new ThreadNotify(o);
        ThreadNotify threadNotify2 = new ThreadNotify(o);
        ThreadNotify threadNotify3 = new ThreadNotify(o);
        threadNotify1.start();
        threadNotify2.start();
        threadNotify3.start();
        Thread.sleep(1000);
        synchronized (o){
            System.out.println(Thread.currentThread().getName()+"call notify");
            o.notifyAll();
        }*/
       /* new Thread(pa).start();
        Thread.sleep(100);  //确保按顺序A、B、C执行
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);*/

    }
}
