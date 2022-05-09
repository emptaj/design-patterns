package Holding;

import java.util.Optional;

public abstract class BonusCalculator implements IBonusCalculator {
    private Optional<IBonusCalculator> wrapee;

    public BonusCalculator(IBonusCalculator wrapee) {
        this.wrapee = Optional.ofNullable(wrapee);
    }

    public double getBonus(String NIP) {
        if (wrapee.isPresent()) return wrapee.get().getBonus(NIP);
        return 0;
    }
}
