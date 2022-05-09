package wtwo.pl;

public class NiemcyPodatekFabryka extends KrajPodatekFabryka{
    @Override
    public float obliczWartoscPodatkuLiniowego(float wartosc) {
        return (float) 0.2 * wartosc;
    }

    @Override
    public float obliczWartoscPodatkuProgresywnego(float wartosc) {
        return (wartosc <= 50000)? obliczWartoscPodatkuLiniowego(wartosc) : (float) 0.4 * wartosc;
    }
}
