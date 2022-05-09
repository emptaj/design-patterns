package Holding;

public interface ICompany {
    public double getAnnualRevenues();
    public double getAnnualIncomes();
    public String getAddress();
    public String getName();
    public String getNIP();
    public double calculateCompleteBonus();
    public void accept(IExportVisitor visitor);
}
