package org.csystem.app.company.employee;

public class SalesManager extends Manager {
    private double m_extraFee;

    //...

    public SalesManager(String name, String citizenId, String address, String department, double salary, double extraFee)
    {
        super(name, citizenId, address, department, salary);
        m_extraFee = extraFee;
    }

    public double getExtraFee()
    {
        return m_extraFee;
    }

    public void setExtraFee(double extraFee)
    {
        m_extraFee = extraFee;
    }

    //...

    public Double calculateInsurancePayment()
    {
        return super.calculateInsurancePayment() + m_extraFee;
    }

    public String toString()
    {
        return String.format("%s, %f", super.toString(), m_extraFee);
    }
}
