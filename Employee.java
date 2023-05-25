public class Employee {

    String name;
    double salary;
    int workHours, hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if(salary > 1000) {
            tax += (salary * 0.03);
        }else {
            tax = 0;
        }
        return tax;
    }

    public double bonus() {
        double bonusFee;
        if(workHours > 40) {
            bonusFee = (workHours - 40) * 30;
        }else {
            bonusFee = 0;
        }
        return bonusFee;
    }

    public double raiseSalary() {
        double increasedSalary = 0;
        if((2021 - hireYear) < 10) {
            increasedSalary += (salary * 0.05);
        }
        if(((2021 - hireYear) > 9) && ((2021 - hireYear) < 20)) {
            increasedSalary += (salary * 0.10);
        }
        if((2021 - hireYear) > 19) {
            increasedSalary += (salary * 0.15);
        }
        return increasedSalary;
    }

    public void printInfo() {
        System.out.println("\n Name : " + this.name
                + "\nSalary : " + this.salary
                + "\nWork hours : " + this.workHours
                + "\nStarting Year : " + this.hireYear
                + "\nTax : " + this.tax()
                + "\nBonus : " + this.bonus()
                + "\nSalary Increased : " + this.raiseSalary()
                + "\nTax + Bonus with Salary : " + ((salary + bonus()) - tax())
                + "\nTotal Salary : " + (salary + raiseSalary()));
    }

}
