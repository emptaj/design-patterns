package com.company;

public class AlertChecker extends Checker {
    public AlertChecker(Checker nextChecker) {
        super(nextChecker);
    }

    @Override
    public void check(Message message) {
        StringBuilder builder = new StringBuilder();

        if (message.getMessageType() == MessageType.ALERT) {
            builder.append("UWAGA! Ważna wiadomość. ");
            builder.append(message.getText());
        } else {
            builder.append(message.getText());
            builder.append(" To nie jest ważna wiadomość.");
        }

        message.setText(builder.toString());

        super.check(message);
    }

}
