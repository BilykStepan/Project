package Payment;

import Employee.Worker;

public class DayPayment extends Worker implements PaymentInterface {
    public DayPayment(String name, int age, String position, Double rate, Integer workingParameter) {
        super(name, age, position, rate, workingParameter);
    }
    @Override
    public String getSalary() {
        return ("Worker " + getName() + " gets salary of: " + getRatePerHour() * getWorkingParameter() * 8 + " per " + getWorkingParameter() + " days worked.");
    }
    public void display(){
        System.out.printf("Worker: %s, age: %s, position: %s.\n", super.getName(), super.getAge(), getPosition());
    }
}
