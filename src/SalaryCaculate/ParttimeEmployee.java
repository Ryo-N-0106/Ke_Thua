package SalaryCaculate;

public class ParttimeEmployee extends Employee {
    public int hoursWorked;
    private double hourlyRate;

    public ParttimeEmployee(String name, int hoursWorked, double hourlyRate){
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double caculateSalary(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getType() {
        return "Part-time";
    }

    public int getHoursWorked(){
        return hoursWorked;
    }
}
