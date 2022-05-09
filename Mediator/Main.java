package com.company;

public class Main {

    public static void main(String[] args) {
	KwateraGlowna kwateraGlowna = new KwateraGlowna();

    CentrumDowodzenia centrumDowodzenia = new CentrumDowodzenia(kwateraGlowna);
    Wywiad wywiad = new Wywiad(kwateraGlowna);
    PierwszaArmia pierwszaArmia = new PierwszaArmia(kwateraGlowna);
    DrugaArmia drugaArmia = new DrugaArmia(kwateraGlowna);

    kwateraGlowna.setPierwszaArmia(pierwszaArmia);
    kwateraGlowna.setDrugaArmia(drugaArmia);
    kwateraGlowna.setWywiad(wywiad);
    kwateraGlowna.setCentrumDowodzenia(centrumDowodzenia);

    wywiad.donies("Wróg planuje ruch na wschód", PierwszaArmia.idJednostki);
    pierwszaArmia.donies("Atakujemy lewą flankę", DrugaArmia.idJednostki);
    centrumDowodzenia.donies("Atakuj tyły wroga", DrugaArmia.idJednostki);
    centrumDowodzenia.donies("Przewidywany deszcz. Zwiąż siły wroga w okolicach bagien", PierwszaArmia.idJednostki);

    }
}
