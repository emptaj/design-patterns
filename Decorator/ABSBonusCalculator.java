package Holding;

public class ABSBonusCalculator extends BonusCalculator {

    public ABSBonusCalculator(IBonusCalculator wrapee) {
        super(wrapee);
    }

    private Boolean isCorrect(String NIP) {
        for (int i = 0; i < NIP.length() - 1; i++) {
            if (Math.abs((int) NIP.charAt(i) - NIP.charAt(i + 1)) <= 50)
                return false;
        }
        return true;
    }

    public double getBonus(String NIP) {
        double bonus = super.getBonus(NIP);
        boolean correct = isCorrect(NIP);

        return (correct)? bonus + 50: bonus;
    }
}
