package org.example;

public class MyThread extends Thread {

    SynchronizedAccount account;

    public MyThread(SynchronizedAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        // Simulate transactions on the account
        //Adds up to 35, happens each time on each thread
        //Should add up to 350 at the end
        account.deposit(10);
        account.withdraw(20);
        account.withdraw(5);
        account.deposit(50);

        System.out.println("Balance: " + account.getBalance());
    }
}
