package Holding;

import java.time.LocalDate;

public class DateBonusCalculator extends BonusCalculator {


    public DateBonusCalculator(IBonusCalculator wrapee) {
        super(wrapee);
    }

    public double getBonus(String NIP) {
        double bonus = super.getBonus(NIP);
        String currentDate = String.valueOf(LocalDate.now().getMonthValue()) + LocalDate.now().getDayOfMonth();
        return (NIP.contains(currentDate)) ? bonus + 15 : bonus;

    }
}
