package wtwo.pl;

public class Ksiazka extends Przedmiot {
    private int rokWydania;
    private int numerWydania;


    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public void setNumerWydania(int numerWydania) {
        this.numerWydania = numerWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public int getNumerWydania() {
        return numerWydania;
    }

    public Ksiazka(int rokWydania, int numerWydania) {
        this.rokWydania = rokWydania;
        this.numerWydania = numerWydania;
    }

    @Override
    public float okreslWartosc() {
        return (2050 - (float) this.rokWydania) / (float) this.numerWydania;
    }

}
