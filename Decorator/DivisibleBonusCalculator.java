package Holding;

public class DivisibleBonusCalculator extends BonusCalculator {

    public DivisibleBonusCalculator(IBonusCalculator wrapee) {
        super(wrapee);
    }

    public double getBonus(String NIP) {
        double bonus = super.getBonus(NIP);
        int counter = 0;

        for (int i = 0; i < NIP.length(); i++) {
            if ((int) NIP.charAt(i) % 3 != 0) counter++;
        }

        return (counter >= NIP.length() / 2) ? bonus + 100 : bonus;
    }
}
