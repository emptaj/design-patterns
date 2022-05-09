package com.company;

public class DrugaArmia extends PierwszaArmia {
    public static String idJednostki = "DRUGA ARMIA";
    private KwateraGlowna kwateraGlowna;

    public DrugaArmia(KwateraGlowna kwateraGlowna) {
        super(kwateraGlowna);
    }

    @Override
    public void donies(String tresc, String odbiorca) {
        Wiadomosc wiadomosc = new Wiadomosc(idJednostki, odbiorca, TypWiadomosci.DONIESIENIE, tresc);
        kwateraGlowna.przekaz(wiadomosc);
    }

    @Override
    public void poinformuj(Wiadomosc wiadomosc) {
        System.out.println("WIADOMOŚĆ DLA DRUGIEJ ARMII: " + wiadomosc);
    }

}
