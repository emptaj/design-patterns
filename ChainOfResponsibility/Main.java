package com.company;

public class Main {

    public static void main(String[] args) {
        Message message = new Message("Ala ma kota.");
        Message.setMessageTypeRandomly(message);
        Checker chain = new AlertChecker(new SpamChecker(new OtherChecker(null)));

        chain.check(message);

        System.out.println(message.getText());
    }
}
