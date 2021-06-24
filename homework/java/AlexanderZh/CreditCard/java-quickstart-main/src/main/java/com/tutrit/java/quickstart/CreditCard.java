package com.tutrit.java.quickstart;

public class CreditCard {

    private String cartNumber;
    private int pinCode;
    private double balance;
    private double creditBalance;
    private double creditDebit;

    public CreditCard(String cartNumber, int pinCode, double creditBalance) {
        this.cartNumber = cartNumber;
        this.pinCode = pinCode;
        this.creditBalance = creditBalance;
        this.balance = 0.0;
        this.creditDebit = 0.0;
    }

    public void withdraw(int pinCode ,double amountOfMoney) {
        System.out.print("Снятие со счета ");
        if (this.pinCode == pinCode) {
            if (this.balance >= amountOfMoney) {
                this.balance -= amountOfMoney;
            } else {
                double amountOfMoneyTmp = amountOfMoney - this.balance;
                if ((this.creditDebit + amountOfMoneyTmp) < creditBalance) {
                    this.balance = 0;
                    this.creditDebit += amountOfMoneyTmp;
                } else {
                    System.out.print("Не достаточно средств на карте и кредите ");
                }
            }
            System.out.println("Основной баланс " + balance + " кредитная задолженость " + creditDebit);
        }else {
            System.out.println("Не верно введен пин-код");
        }
    }

    public void deposit(int pinCode ,double amountOfMoney) {
        System.out.print("Зачисление на счет ");
        if (this.pinCode == pinCode) {
            if (this.creditDebit > 0) {
                double amountOfMoneyTmp = amountOfMoney - this.creditDebit;
                if (amountOfMoneyTmp > 0) {
                    this.balance += amountOfMoneyTmp;
                }
            } else {
                this.balance += amountOfMoney;
            }
            System.out.println("Основной баланс " + balance + " кредитная задолженость " + creditDebit);
        }else {
            System.out.println("Не верно введен пин-код");
        }
    }

}
