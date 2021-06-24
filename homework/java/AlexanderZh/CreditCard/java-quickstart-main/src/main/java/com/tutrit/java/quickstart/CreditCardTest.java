package com.tutrit.java.quickstart;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234123412341234", 1234,1000.0);
        creditCard.deposit(1222, 1000);
        creditCard.deposit(1234, 100);
        creditCard.withdraw(1222, 10);
        creditCard.withdraw(1234, 10);
        creditCard.withdraw(1234, 140);
        creditCard.deposit(1234, 100);
        creditCard.withdraw(1234, 2000);
    }


}
