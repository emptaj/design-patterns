package Holding;

import javax.xml.bind.annotation.XmlElement;

public class SingleCompany implements ICompany {
    protected String name;
    protected String address;
    protected String NIP;
    protected double annualRevenues; //przychody
    protected double annualIncomes;   //dochody

    public SingleCompany(String name,
                         String address,
                         String NIP,
                         double annualRevenues,
                         double annualIncomes) {
        this.name = name;
        this.address = address;
        this.NIP = NIP;
        this.annualRevenues = annualRevenues;
        this.annualIncomes = annualIncomes;
    }

    @XmlElement
    @Override
    public double getAnnualRevenues() {
        return annualRevenues;
    }

    @XmlElement
    @Override
    public double getAnnualIncomes() {
        return annualIncomes;
    }

    @XmlElement
    @Override
    public String getAddress() {
        return address;
    }

    @XmlElement
    @Override
    public String getName() {
        return name;
    }

    @XmlElement
    @Override
    public String getNIP() {
        return NIP;
    }

    @Override
    public double calculateCompleteBonus() {
        BonusCalculator bc = new SumBonusCalculator(new ABSBonusCalculator(null));
        bc = new AllOddBonusCalculator(bc);
        bc = new DateBonusCalculator(bc);
        bc = new DivisibleBonusCalculator(bc);

        return bc.getBonus(NIP);
    }

    @Override
    public void accept(IExportVisitor visitor) {
        visitor.visit(this);
    }

}
