package org.csystem.app.company.employee;

public interface IInsurance<P, ID> {
    P calculateInsurancePayment();
    ID getId();
}
