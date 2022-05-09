package wtwo.pl;

public class PodatekLiniowy implements IPodatekStrategia{
    @Override
    public double obliczWartoscPodatku(float wartosc) {
        return (0.19 * wartosc);
    }
}
