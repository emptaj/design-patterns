package wtwo.pl;

public class Rzezba extends Przedmiot{
    private int rokWykonania;
    private double rozmiar;

    public void setRokWykonania(int rokWykonania) {
        this.rokWykonania = rokWykonania;
    }

    public void setRozmiar(double rozmiar) {
        this.rozmiar = rozmiar;
    }

    public int getRokWykonania() {
        return rokWykonania;
    }

    public double getRozmiar() {
        return rozmiar;
    }

    public Rzezba(int rokWykonania, int rozmiar) {
        this.rokWykonania = rokWykonania;
        this.rozmiar = rozmiar;
    }

    @Override
    public float okreslWartosc() {
        float wartosc = (2020 - (float)this.rokWykonania) * (float)this.rozmiar * 2;
        return wartosc;
    }

}
