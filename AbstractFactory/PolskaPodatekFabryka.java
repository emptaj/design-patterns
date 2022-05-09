package wtwo.pl;

public class PolskaPodatekFabryka extends KrajPodatekFabryka{
    @Override
    public float obliczWartoscPodatkuLiniowego(float wartosc) {
        return (float)(0.19 * wartosc);
    }

    @Override
    public float obliczWartoscPodatkuProgresywnego(float wartosc) {
        return (wartosc <= 10000)? (float)0.18 * wartosc : (float)0.32 * wartosc;
    }
}
