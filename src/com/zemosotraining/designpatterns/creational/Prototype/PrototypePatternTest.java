package com.zemosotraining.designpatterns.creational.Prototype;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();
        System.out.println("Original employees: " + employees.getEmpList());

        System.out.println("--------- Deep Copy -------------");
        Employees empClone1 = (Employees) employees.clone();
        empClone1.getEmpList().add("NEW EMPLOYEE");
        System.out.println("empClone1: " + empClone1.getEmpList());

        Employees empClone2 = (Employees) employees.clone();
        empClone2.getEmpList().remove(1);
        System.out.println("empClone2: " + empClone2.getEmpList());

        System.out.println("Original employees: " + employees.getEmpList());

        System.out.println("--------- Shallow Copy -------------");
        Employees emp = employees;
        employees.getEmpList().add("shallow");
        System.out.println("Shallow employees: " + emp.getEmpList());
        System.out.println("Original employees: " + employees.getEmpList());

    }
}