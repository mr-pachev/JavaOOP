package Lab._02_SalaryIncrease_02;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        double resultFromBonus = 1;
        bonus = bonus / 100;

        if (this.getAge() < 30) {
            resultFromBonus += bonus / 2;
        } else {
            resultFromBonus += bonus;
        }
        this.setSalary(resultFromBonus * this.getSalary());
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0###");
        return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), decimalFormat.format(this.salary));
    }
}
