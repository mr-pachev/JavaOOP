package Lab._02_ValidationData_03;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private double salary;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.setAge(age);
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName, lastName, age);
        this.setSalary(salary);
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
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
