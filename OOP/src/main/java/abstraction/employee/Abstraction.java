package abstraction.employee;

public class Abstraction {

    public static void main(String[] args) {
        Employee contractor = new Contractor("Contractor", 10, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);

        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());

    }




}
