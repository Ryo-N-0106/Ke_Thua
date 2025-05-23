package SalaryCaculate;

public class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double caculateSalary(){
        return monthlySalary;
    }

    @Override
    public String getType(){
        return "Full-time";
    }
}
