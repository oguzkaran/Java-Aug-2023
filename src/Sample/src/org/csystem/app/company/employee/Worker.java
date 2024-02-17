package org.csystem.app.company.employee;

public class Worker extends Employee {
    private int m_hourPerDay;
    private double m_feePerHour;

    //...

    public Worker(String name, String citizenId, String address, int hourPerDay, double feePerHour)
    {
        super(name, citizenId, address);
        m_hourPerDay = hourPerDay;
        m_feePerHour = feePerHour;
    }

    public int getHourPerDay()
    {
        return m_hourPerDay;
    }

    public void setHourPerDay(int hourPerDay)
    {
        m_hourPerDay = hourPerDay;
    }

    public double getFeePerHour()
    {
        return m_feePerHour;
    }

    public void setFeePerHour(double feePerHour)
    {
        m_feePerHour = feePerHour;
    }

    public double calculateInsurancePayment()
    {
        return m_feePerHour * m_hourPerDay * 30;
    }

    //...

    public String toString()
    {
        return String.format("%s, %d, %f", super.toString(), m_hourPerDay, m_feePerHour);
    }
}
