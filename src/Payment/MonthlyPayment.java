package Payment;

import Employee.Worker;

public class MonthlyPayment extends Worker implements PaymentInterface {
    public MonthlyPayment(String name, int age, String position, Double rate, Integer workingParameter) {
        super(name, age, position, rate, workingParameter);
    }
    @Override
    public String getSalary() {
        return ("Worker " + getName() + " gets salary of: " + getRatePerHour() * getWorkingParameter() * 160 + " per " + getWorkingParameter() + " months worked.");
    }
    public void display(){
        System.out.printf("Worker: %s, age: %s, position: %s.\n", super.getName(), super.getAge(), getPosition());
    }
}

