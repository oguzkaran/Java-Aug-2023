package org.csystem.app.company;

import org.csystem.app.company.employee.Employee;
import org.csystem.app.company.factory.EmployeeFactory;
import org.csystem.app.company.hr.HumanResources;
import org.csystem.util.console.Console;
import org.csystem.util.thread.ThreadUtil;

public class DemoCompanyApp {
    public static void run()
    {
        HumanResources hr = new HumanResources();
        EmployeeFactory ef = new EmployeeFactory();

        while (true) {
            Employee e = ef.getEmployee();

            Console.writeLine("------------------------------------------------------");
            Console.writeLine(e.getClass().getName());
            hr.payInsurance(e);
            Console.writeLine("------------------------------------------------------");

            ThreadUtil.sleep(1000);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
