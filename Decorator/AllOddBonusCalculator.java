package Holding;

public class AllOddBonusCalculator extends BonusCalculator {

    public AllOddBonusCalculator(IBonusCalculator wrapee) {
        super(wrapee);
    }

    private Boolean isCorrect(String NIP) {
        for (int i = 0; i < NIP.length(); i++) {
            if ((int) NIP.charAt(i) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public double getBonus(String NIP) {
        Double bonus = super.getBonus(NIP);
        Boolean correct = isCorrect(NIP);

        return (correct) ? bonus += 50 : bonus;
    }
}
