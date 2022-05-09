package Holding;

import java.util.ArrayList;
import java.util.List;

public class HoldingCompany extends SingleCompany {
    private final List<ICompany> companies;

    public HoldingCompany(String name, String address, String NIP, double annualRevenues, double annualIncomes) {
        super(name, address, NIP, annualRevenues, annualIncomes);
        this.companies = new ArrayList<>();
    }

    public void addCompany(ICompany companyToAdd) {
        companies.add(companyToAdd);
    }

    @Override
    public String getAddress() {
        StringBuilder builder = new StringBuilder(address);
        builder.append(", ");

        companies.stream()
                .map(ICompany::getAddress)
                .forEach(str -> {
                    builder.append(str);
                    builder.append(", ");
                });

        builder.deleteCharAt(builder.length() - 2);
        return builder.toString();
    }

    @Override
    public String getName() {
        StringBuilder builder = new StringBuilder(super.getName());
        builder.append(", ");

        companies.stream()
                .map(ICompany::getName)
                .forEach(str -> {
                    builder.append(str);
                    builder.append(", ");
                });

        builder.deleteCharAt(builder.length() - 2);
        return builder.toString();

    }

    @Override
    public double getAnnualIncomes() {
        double result = super.getAnnualIncomes();

        result += companies.stream()
                .mapToDouble(ICompany::getAnnualIncomes)
                .sum();

        return result;
    }

    @Override
    public double getAnnualRevenues() {
        double result = super.getAnnualRevenues();


        result += companies.stream()
                .mapToDouble(ICompany::getAnnualRevenues)
                .sum();

        return result;
    }

    @Override
    public double calculateCompleteBonus() {
        double completeBonus = super.calculateCompleteBonus();

        completeBonus += companies.stream().mapToDouble(company -> company.calculateCompleteBonus())
                .sum();

        return completeBonus;
    }

    public List<ICompany> getCompanies() {
        return companies;
    }

    @Override
    public void accept(IExportVisitor visitor) {
        visitor.visit(this);
    }
}
