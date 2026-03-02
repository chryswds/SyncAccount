package org.example;

public class SynchronizedAccount {


    public int balance;



    public SynchronizedAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }


    public synchronized void withdraw(int amount){
        balance -= amount;
    }

    public synchronized int getBalance() {
        return balance;
    }


}
