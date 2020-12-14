package com.company;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("1234","Немов К.А.");
        Account.Check(acc1);

        Account acc2 = new Account("432100","Акимов Р.с.");
        Account.Check(acc2);

        Account acc3 = new Account("1234567890","Замотин А.К.");
        Account.Check(acc3);
    }
}
