package com.company;

public class Message {
    private String text;
    private MessageType messageType;

    public Message(String text, MessageType messageType) {
        this.text = text;
        this.messageType = messageType;
    }

    public Message(String text) {
        this.text = text;
        this.messageType = null;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static void setMessageTypeRandomly(Message message) {
        if (message.messageType == null) {
            message.setMessageType(MessageType.getRandomMessageType());
        }
    }
}
