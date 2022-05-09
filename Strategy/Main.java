package wtwo.pl;

public class Main {

    public static void main(String[] args) {
        // Część I
        Magazyn m1 = new Magazyn();

        m1.dodajDoSpisu(new Ksiazka(1999, 2));
        m1.dodajDoSpisu(new Ksiazka(2006, 3));
        m1.dodajDoSpisu(new Obraz(1800));
        m1.dodajDoSpisu(new Obraz(1900));
        m1.dodajDoSpisu(new Rzezba(1500, 3));
        m1.dodajDoSpisu(new Rzezba(900, 5));

        System.out.println("Bez podatku: " + m1.getWartoscMagazynu());
        System.out.println("Z podatkiemm liniowym " + m1.pobierzWartoscPoOpodatkowaniu(new PodatekLiniowy()));
        System.out.println("Z podatkiemm progresywnym " + m1.pobierzWartoscPoOpodatkowaniu(new PodatekProgresywny()));


        USAPodatekFabryka f1 = new USAPodatekFabryka();
        PolskaPodatekFabryka f2 = new PolskaPodatekFabryka();
        System.out.println(f1.obliczWartoscPodatkuLiniowego(233));
        USDtoEURAdapter ad1 = new USDtoEURAdapter(f1);
        System.out.println(ad1.konwertujPodatekLiniowyUSD(233));


    }

}
