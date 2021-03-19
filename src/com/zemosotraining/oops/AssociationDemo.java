package com.zemosotraining.oops;

// Association btw Bank & Employee in main (one - many)
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return employeeName;
    }
}

class Bank {
    private String bankName;
    private List<Employee> empList;

    public Bank(String bankName, List<Employee> empList) {
        this.bankName = bankName;
        this.empList = empList;
    }

    public String getBankName() {
        return bankName;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

}

public class AssociationDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Saritha"));
        employees.add(new Employee("Kumar"));
        Bank bank = new Bank("HDFC", employees);

        System.out.println("Bank name: " + bank.getBankName() + " has the Employees " + bank.getEmpList());

    }
}
