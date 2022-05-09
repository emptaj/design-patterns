package Holding;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXB;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class XMLExportVisitor implements IExportVisitor {
    @Override
    public void visit(SingleCompany company) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(company, sw);
        String xmlString = sw.toString();
        System.out.println(xmlString);
    }

    @Override
    public void visit(HoldingCompany company) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(company, sw);

        for (ICompany compan : company.getCompanies())
            JAXB.marshal(compan, sw);

        String xmlString = sw.toString();
        System.out.println(xmlString);
    }
}
