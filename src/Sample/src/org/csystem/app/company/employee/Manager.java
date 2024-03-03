package org.csystem.app.company.employee;

public class Manager extends Employee {
    private String m_department;
    private double m_salary;

    //...

    public Manager(String name, String citizenId, String address, String department, double salary)
    {
        super(name, citizenId, address);
        m_department = department;
        m_salary = salary;
    }

    public String getDepartment()
    {
        return m_department;
    }

    public void setDepartment(String department)
    {
        m_department = department;
    }

    public double getSalary()
    {
        return m_salary;
    }

    public void setSalary(double salary)
    {
        m_salary = salary;
    }

    //...

    public Double calculateInsurancePayment()
    {
        return m_salary * 1.5;
    }

    public String toString()
    {
        return String.format("%s, %s, %s", super.toString(), m_salary, m_department);
    }
}
