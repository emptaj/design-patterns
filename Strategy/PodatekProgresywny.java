package wtwo.pl;

class PodatekProgresywny implements IPodatekStrategia{

    @Override
    public double obliczWartoscPodatku(float wartosc) {
        return (wartosc <= 10000)? 0.18 * wartosc : 0.32 * wartosc;
    }
}