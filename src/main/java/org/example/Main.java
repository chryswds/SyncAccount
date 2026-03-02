package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException{



        ArrayList<MyThread> threadList = new ArrayList<>();
        SynchronizedAccount account = new SynchronizedAccount(0);





        for (int i=0; i<10; i++) {
            MyThread t = new MyThread(account);
            t.start();
            threadList.add(t);
        }

        for (MyThread thread : threadList) {
            System.out.println(thread.account.getBalance());
        }



    }
}