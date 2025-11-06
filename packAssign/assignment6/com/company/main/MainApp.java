package com.company.main;

import com.company.hr.Employee;
import com.company.payroll.Payroll;

public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(1);
        e.setName("nina");
        e.setDepartment("it");
        e.setSalary(50000);
        Payroll p = new Payroll();
        double bonus = p.calculateBonus(e);
        double total = e.getSalary() + bonus;
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getDepartment());
        System.out.println(e.getSalary());
        System.out.println(total);
    }
}
