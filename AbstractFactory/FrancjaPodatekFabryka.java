package wtwo.pl;

public class FrancjaPodatekFabryka extends KrajPodatekFabryka{
    @Override
    public float obliczWartoscPodatkuLiniowego(float wartosc) {
        return (float) 0.3 * wartosc;
    }

    @Override
    public float obliczWartoscPodatkuProgresywnego(float wartosc) {
        return (wartosc <= 40000)? obliczWartoscPodatkuLiniowego(wartosc) : (float) 0.5 * wartosc;
    }
}
