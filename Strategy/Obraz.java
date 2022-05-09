package wtwo.pl;

public class Obraz extends Przedmiot {
    private int rokNamalowania;

    public void setRokNamalowania(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    public int getRokNamalowania() {
        return rokNamalowania;
    }

    public Obraz(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    @Override
    public float okreslWartosc() {
        return (2100 - (float) this.rokNamalowania) * 10;
    }


}
