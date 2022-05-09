package com.company;

import java.util.HashMap;

public class KwateraGlowna implements Mediator{
    private PierwszaArmia pierwszaArmia;
    private DrugaArmia drugaArmia;
    private CentrumDowodzenia centrumDowodzenia;
    private Wywiad wywiad;

    public void setPierwszaArmia(PierwszaArmia pierwszaArmia) {
        this.pierwszaArmia = pierwszaArmia;
    }

    public void setDrugaArmia(DrugaArmia drugaArmia) {
        this.drugaArmia = drugaArmia;
    }

    public void setCentrumDowodzenia(CentrumDowodzenia centrumDowodzenia) {
        this.centrumDowodzenia = centrumDowodzenia;
    }

    public void setWywiad(Wywiad wywiad) {
        this.wywiad = wywiad;
    }


    @Override
    public void przekaz(Wiadomosc wiadomosc) {
        TypWiadomosci typWiadomosci = wiadomosc.getTypWiadomosci();

        if (typWiadomosci == TypWiadomosci.ROZKAZ) {
            obsluzRozkaz(wiadomosc);
        }

        else obsluzDoniesienie(wiadomosc);

    }

    private void obsluzDoniesienie(Wiadomosc wiadomosc) {
        //KAŻDE DONIESIE WĘDRUJE RÓWNIEŻ DO CENTRUM DOWODZENIA
       centrumDowodzenia.poinformuj(wiadomosc);

        String odbiorca = wiadomosc.getOdbiorca();
        if (odbiorca.equals(pierwszaArmia.idJednostki))
            pierwszaArmia.poinformuj(wiadomosc);

        else if (odbiorca.equals(drugaArmia.idJednostki))
            drugaArmia.poinformuj(wiadomosc);

        else if (odbiorca.equals(wywiad.idJednostki))
            wywiad.poinformuj(wiadomosc);


    }

    private void obsluzRozkaz(Wiadomosc wiadomosc) {
        String odbiorca = wiadomosc.getOdbiorca();

        if (odbiorca.equals(pierwszaArmia.idJednostki))
            pierwszaArmia.poinformuj(wiadomosc);

        else if (odbiorca.equals(drugaArmia.idJednostki))
            drugaArmia.poinformuj(wiadomosc);
    }
}
