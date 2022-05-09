package com.company;

public class CentrumDowodzenia implements Jednostka {
    public static String idJednostki = "CENTRUM DOWODZENIA";
    private KwateraGlowna kwateraGlowna;

    public CentrumDowodzenia(KwateraGlowna kwateraGlowna) {
        this.kwateraGlowna = kwateraGlowna;
    }

    @Override
    public void donies(String tresc, String odbiorca) {
        Wiadomosc wiadomosc = new Wiadomosc(idJednostki, odbiorca, TypWiadomosci.ROZKAZ, tresc);
        kwateraGlowna.przekaz(wiadomosc);

    }

    @Override
    public void poinformuj(Wiadomosc wiadomosc) {
        System.out.println("WIADOMOŚĆ DLA CENTRUM DOWODZENIA: " + wiadomosc);
    }
}
