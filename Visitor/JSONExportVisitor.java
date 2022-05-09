package Holding;
import com.google.gson.Gson;

public class JSONExportVisitor implements IExportVisitor {
    @Override
    public void visit(SingleCompany company) {
        System.out.println(new Gson().toJson(company));
    }

    @Override
    public void visit(HoldingCompany company) {
        System.out.println(new Gson().toJson(company));
    }
}
