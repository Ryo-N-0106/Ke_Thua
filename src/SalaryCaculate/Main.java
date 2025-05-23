package SalaryCaculate;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new FulltimeEmployee("Van",7000000);
        employees[1] = new FulltimeEmployee("Khoa",10000000);
        employees[2] = new ParttimeEmployee("Minh",22,15000);
        employees[3] = new ParttimeEmployee("Tran",30,35000);
        employees[4] = new ParttimeEmployee("Trong",25,40000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Type: " + employees[i].getType());
            System.out.println("Salary: " + employees[i].caculateSalary() + " VND\n");
        }


    }
}
