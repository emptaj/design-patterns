package Holding;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SingleCompany s1 = new SingleCompany("Fajna firma", "Lublin", "2468422", 123123, 32314);
        SingleCompany s2 = new SingleCompany("Niefajna firma", "Kraków", "4444444", 41231491, 1235);
        HoldingCompany h1 = new HoldingCompany("EKIPA HOLDING S.A", "Rzeszów", "4785645", 475154865, 569567);
        HoldingCompany h2 = new HoldingCompany("Bardzo duży holding", "Warszawa", "9984526", 221312, 554845);

        h1.addCompany(s1);
        h1.addCompany(s2);
        h2.addCompany(h1);

        System.out.println(h2.getAnnualIncomes());
        h2.calculateCompleteBonus();

    }
}
