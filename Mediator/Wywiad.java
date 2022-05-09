package com.company;

public class Wywiad implements Jednostka {
    public static String idJednostki = "WYWIAD";
    private KwateraGlowna kwateraGlowna;

    public Wywiad(KwateraGlowna kwateraGlowna) {
        this.kwateraGlowna = kwateraGlowna;
    }

    @Override
    public void donies(String tresc, String odbiorca) {
        Wiadomosc wiadomosc = new Wiadomosc(idJednostki, odbiorca, TypWiadomosci.DONIESIENIE, tresc);
        kwateraGlowna.przekaz(wiadomosc);
    }

    @Override
    public void poinformuj(Wiadomosc wiadomosc) {
        System.out.println("WIADOMOŚĆ DLA WYWIADU: " + wiadomosc);

    }
}
