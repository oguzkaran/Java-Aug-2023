package org.csystem.app.company.factory;

import org.csystem.app.company.employee.*;

import java.util.Random;

public class EmployeeFactory {
    private final Random m_random = new Random();

    private Worker getWorker()
    {
        //...
        return new Worker("Ali", "12345678", "Mecidiyeköy", 8, 900);
    }

    private Manager getManager()
    {
        //...
        return new Manager("Veli", "123456786", "Şişli", "Pazarlama", 200000);
    }

    private Manager getSalesManager()
    {
        //...
        return new SalesManager("Selami", "1234567868", "Fulya", "Pazarlama", 200000, 10000);
    }

    private ProjectWorker getProjectWorker()
    {
        //...
        return new ProjectWorker("Ali", "12345678", "Mecidiyeköy", 8, 900, "Mobile", 234);
    }

    public Employee getEmployee()
    {
        return switch (m_random.nextInt(4)) {
            case 0 -> getWorker();
            case 1 -> getManager();
            case 2 -> getProjectWorker();
            default -> getSalesManager();
        };
    }
}
