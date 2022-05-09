package com.company;

public class OtherChecker extends Checker {
    public OtherChecker(Checker nextChecker) {
        super(nextChecker);
    }

    @Override
    public void check(Message message) {
        StringBuilder builder = new StringBuilder();

        if (message.getMessageType() != MessageType.OTHER) {

            builder.append(message.getText());
            builder.append(" To nie jest wiadomość z kategorii inne.");
            message.setText(builder.toString());
        }

        super.check(message);
    }
}
