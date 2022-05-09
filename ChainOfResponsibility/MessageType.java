package com.company;

import java.util.Random;

public enum MessageType {
    SPAM,
    ALERT,
    OTHER;

    public static MessageType getRandomMessageType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

