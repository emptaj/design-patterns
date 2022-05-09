package com.company;

public class Wiadomosc {
    private String nadawca;
    private String odbiorca;
    private String tresc;
    private TypWiadomosci typWiadomosci;

    public String getOdbiorca() {
        return odbiorca;
    }


    @Override
    public String toString() {
        return typWiadomosci +
                " (nadawca='" + nadawca + '\'' +
                ", tresc='" + tresc + '\'' +
                ')';
    }

    public Wiadomosc(String nadawca, String odbiorca, TypWiadomosci typWiadomosci, String tresc) {
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
        this.typWiadomosci = typWiadomosci;
        this.tresc = tresc;
    }

    public TypWiadomosci getTypWiadomosci() {
        return typWiadomosci;
    }


}
