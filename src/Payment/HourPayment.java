package Payment;

import Employee.Worker;

public class HourPayment extends Worker implements PaymentInterface {
    public HourPayment(String name, int age, String position, Double rate, Integer workingParameter) {
        super(name, age, position, rate, workingParameter);
    }
    @Override
    public String getSalary() {
        return ("Worker " + getName() + " gets salary of: " + getRatePerHour() * getWorkingParameter() + " per " + getWorkingParameter() + " hours worked.");
    }
    public void display(){
        System.out.printf("Worker: %s, age: %s, position: %s.\n", super.getName(), super.getAge(), getPosition());
    }

}

