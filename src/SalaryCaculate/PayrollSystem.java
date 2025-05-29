package SalaryCaculate;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new FulltimeEmployee("Van", 7000000),
                new FulltimeEmployee("Khoa", 10000000),
                new ParttimeEmployee("Minh", 22, 15000),
                new ParttimeEmployee("Tran", 30, 35000),
                new Internship("Tan",2000000)
        };

        double totalSalary = 0;

        for (Employee employee : employees){
            System.out.println("Name: " + employee.getName());
            System.out.println("Type: " + employee.getType());
            System.out.println("Salary: " + employee.caculateSalary());

            totalSalary += employee.caculateSalary();

            if (employee instanceof Internship) {
                Internship intern = (Internship) employee;
                System.out.println(((Internship) employee).attendTranding());
            }

            if (employee instanceof ParttimeEmployee) {
                ParttimeEmployee parttimeEmployee = (ParttimeEmployee) employee;
                System.out.println("Hours Worked: " + ((ParttimeEmployee) employee).getHoursWorked());
            }

            System.out.println();

        }

        System.out.println("Total Salary of all employees: %1.f" + totalSalary);
    }
}
