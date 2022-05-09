package Holding;

public interface IExportVisitor {
    public void visit(SingleCompany company);
    public void visit(HoldingCompany company);
}
