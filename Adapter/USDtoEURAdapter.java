package wtwo.pl;

public class USDtoEURAdapter {
    private USAPodatekFabryka usaFabryka;

    public USDtoEURAdapter(USAPodatekFabryka usaFabryka) {
        this.usaFabryka = usaFabryka;
    }

    public float konwertujPodatekLiniowyUSD(float wartosc) {
        return (float) (this.usaFabryka.obliczWartoscPodatkuLiniowego(wartosc) * 3.8);
    }
    public float konwertujPodatekProgresywnyUSD(float wartosc) {
        return (float) (this.usaFabryka.obliczWartoscPodatkuProgresywnego(wartosc) / 3.8);
    }
}
