class Employee {
    String name;
    int id;
    String department;

    double calculatePay() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.fixedSalary = fixedSalary;
    }

    double calculatePay() {
        return fixedSalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    double calculatePay() {
        return contractAmount;
    }
}

public class Employee {
    public static void main(String[] args) {
        FullTimeEmployee fe = new FullTimeEmployee("Sakib", 101, "IT", 50000);
        PartTimeEmployee pe = new PartTimeEmployee("Bonna", 102, "HR", 20, 80);
        ContractEmployee ce = new ContractEmployee("Chomok", 103, "Finance", "Project X", 10000);

        System.out.println(fe.name + " pay: " + fe.calculatePay());
        System.out.println(pe.name + " pay: " + pe.calculatePay());
        System.out.println(ce.name + " pay: " + ce.calculatePay());
    }
}
