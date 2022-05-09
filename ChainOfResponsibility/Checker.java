package com.company;

public abstract class Checker {
    Checker nextChecker = null;

    public void check(Message message) {
        if (nextChecker != null) {
            nextChecker.check(message);
        }
    }

    public Checker(Checker nextChecker) {
        this.nextChecker = nextChecker;
    }

    public void setNextChecker(Checker nextChecker) {
        this.nextChecker = nextChecker;
    }
}
