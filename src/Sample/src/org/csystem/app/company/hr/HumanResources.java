package org.csystem.app.company.hr;

import org.csystem.app.company.employee.IInsurance;
import org.csystem.util.console.Console;

public class HumanResources {
    //...
    public void payInsurance(IInsurance insurance)
    {
        Console.writeLine("Citizen Id:%s", insurance.getId());
        Console.writeLine("Insurance payment:%f", insurance.calculateInsurancePayment());
    }
}
