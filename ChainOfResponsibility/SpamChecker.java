package com.company;

public class SpamChecker extends Checker {
    public SpamChecker(Checker nextChecker) {
        super(nextChecker);
    }

    @Override
    public void check(Message message) {
        StringBuilder builder = new StringBuilder();

        if (message.getMessageType() == MessageType.SPAM) {
            builder.append("UWAGA! SPAM. ");
            builder.append(message.getText());
        } else {
            builder.append(message.getText());
            builder.append(" To nie jest spam.");
        }

        message.setText(builder.toString());

        super.check(message);
    }
}
