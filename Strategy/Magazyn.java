package wtwo.pl;

import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private List<Przedmiot> listaPrzedmiotow;
    private float wartoscMagazynu;


    public void dodajDoSpisu(Przedmiot przedmiot) {
        this.listaPrzedmiotow.add(przedmiot);
        this.wartoscMagazynu += przedmiot.okreslWartosc();
    }

    public Magazyn() {
        this.listaPrzedmiotow = new ArrayList<>();
        this.wartoscMagazynu = 0;
    }

    public float getWartoscMagazynu() {
        return wartoscMagazynu;
    }

    public float pobierzWartoscPoOpodatkowaniu(IPodatekStrategia podatek) {
        return (float) (this.wartoscMagazynu - podatek.obliczWartoscPodatku(this.wartoscMagazynu));

    }
}
