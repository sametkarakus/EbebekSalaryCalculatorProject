package EMPLOYEE;

public class Employee {
    final String name;
    public double salary;
    final private int workHours, hireYear;

    Employee(int hireYear,int workHours,double salary, String name){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(){
        if (this.salary >= 1000){
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus(){
        int exstraHours = this.workHours - 40;
        if (exstraHours > 0){
            return 30 * exstraHours;
        }
        return 0.0;

    }

    public double raiseSalary(){
        int yearWorked = 2021 - this.hireYear;
        if (yearWorked < 10 ){
            return salary * 0.05;
        }else if (yearWorked >= 10 && yearWorked < 20){
            return salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }public void toString(Employee emp) {
        System.out.println("Employee Name : " + emp.name);
        System.out.println("Tax: " + emp.tax());
        System.out.println("Bonus: " + emp.bonus());
        System.out.println("Raise Salary: " + emp.raiseSalary());
        double totalSalaryWithTaxAndBonus = emp.salary - emp.tax() + emp.bonus();
        System.out.println("Total Salary With Tax And Bonus : " + totalSalaryWithTaxAndBonus);
        double totalSalary = emp.salary + emp.bonus();
        System.out.println("Total Salary With Bonus : " + totalSalary);
    }
}
