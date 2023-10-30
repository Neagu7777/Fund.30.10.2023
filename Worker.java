package ConstructorFund;
import ConstructorFund.Person;

public class Worker extends ConstructorFund.Person {
    private double minSalary;
    private double maxSalary;
    private String gender;

    public Worker(String name, double minSalary, double maxSalary, String gender) {
        super(name);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.gender = gender;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
