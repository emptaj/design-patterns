package wtwo.pl;

public class PLNtoEURAdapter {
    private PolskaPodatekFabryka polskaFabryka;

    public PLNtoEURAdapter(PolskaPodatekFabryka polskaFabryka) {
        this.polskaFabryka = polskaFabryka;
    }

    public float konwertujPodatekLiniowyPLN(float wartosc) {
        return (float) this.polskaFabryka.obliczWartoscPodatkuLiniowego(wartosc) / (float) 4.2;
    }
    public float konwertujPodatekProgresywnyPLN(float wartosc) {
        return (float) this.polskaFabryka.obliczWartoscPodatkuProgresywnego(wartosc) / (float) 4.2;
    }
}
