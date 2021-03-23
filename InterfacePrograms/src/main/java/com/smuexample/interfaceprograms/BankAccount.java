package com.smuexample.interfaceprograms;

public class BankAccount implements Measurable{
    private double balance; // obj.getBalance()
    private int accountNumber; //obj.getAccountNumber()
    private static int LostAssignedNumber = 1000; //BankAccount.LostAssignedNumber

    public BankAccount(double balance) {
        this.balance = balance;
        LostAssignedNumber++;
        accountNumber = LostAssignedNumber;
    }

    public double getMeasure() {
        return balance;
    }

}
