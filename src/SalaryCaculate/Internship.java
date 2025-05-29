package SalaryCaculate;

public class Internship extends Employee{
    private double allowance;

    public Internship(String name,double allowance) {
        super(name);
        this.allowance = allowance;
    }

    public String attendTranding(){
        return getName() + " is attending training";
    }

    @Override
    public double caculateSalary() {
        return allowance;
    }

    @Override
    public String getType(){
        return "Intern";
    }
}
