package org.example;

public class MyThread extends Thread {

    SynchronizedAccount account;

    public MyThread(SynchronizedAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(10);
        account.withdraw(20);
        account.withdraw(5);
        account.deposit(50);

        System.out.println("Balance: " + account.getBalance());
    }
}
