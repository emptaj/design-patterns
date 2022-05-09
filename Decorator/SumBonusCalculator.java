package Holding;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SumBonusCalculator extends BonusCalculator{

    public SumBonusCalculator(IBonusCalculator wrapee) {
        super(wrapee);
    }


    public double getBonus(String NIP) {
        double bonus = super.getBonus(NIP);
        int currentDate = LocalDate.now().getMonthValue() + LocalDate.now().getDayOfMonth();

        int sum = 0;
        for (int i=0; i<NIP.length(); i++)
            sum += (int)(NIP.charAt(i));

        return (sum == currentDate * 3)? bonus + 550 : bonus;
    }
}
