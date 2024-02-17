package org.csystem.app.company.hr;

import org.csystem.app.company.employee.Employee;
import org.csystem.util.console.Console;

public class HumanResources {
    //...
    public void payInsurance(Employee employee)
    {
        Console.writeLine("Citizen Id:%s, Name:%s", employee.getCitizenId(), employee.getName());
        Console.writeLine("Insurance payment:%f", employee.calculateInsurancePayment());
    }
}
