package com.company;

public class PierwszaArmia implements Jednostka {
    public static String idJednostki = "PIERWSZA ARMIA";
    private KwateraGlowna kwateraGlowna;

    public PierwszaArmia(KwateraGlowna kwateraGlowna) {
        this.kwateraGlowna = kwateraGlowna;
    }

    @Override
    public void poinformuj(Wiadomosc wiadomosc) {
        System.out.println("WIADOMOŚĆ DLA PIERWSZEJ ARMII: " + wiadomosc);
    }


    @Override
    public void donies(String tresc, String odbiorca) {
        Wiadomosc wiadomosc = new Wiadomosc(idJednostki, odbiorca, TypWiadomosci.DONIESIENIE, tresc);
        kwateraGlowna.przekaz(wiadomosc);

    }

}
