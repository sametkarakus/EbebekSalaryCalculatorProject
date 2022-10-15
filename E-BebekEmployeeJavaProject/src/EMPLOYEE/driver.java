package EMPLOYEE;

import EMPLOYEE.Employee;

public class driver {
    public static void main(String[] args) {
        Employee ahmet = new Employee(1985, 45, 2000.0, "AHMET");
        ahmet.toString(ahmet);

        Employee ayse = new Employee(2021, 40, 1000.0, "AYŞE");
        ayse.toString(ayse);

        Employee samet = new Employee(2020, 45, 800, "SAMET");
        samet.toString(samet);

        Employee neval = new Employee(2008, 40,1200.0, "NEVAL");
        neval.toString(neval);

    }
}
