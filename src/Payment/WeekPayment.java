package Payment;

import Employee.Worker;

public class WeekPayment extends Worker implements PaymentInterface {
    public WeekPayment(String name, int age, String position, Double rate, Integer workingParameter) {
        super(name, age, position, rate, workingParameter);
    }
    @Override
    public String getSalary() {
        return ("Worker " + getName() + " gets salary of: " + getRatePerHour() * getWorkingParameter() * 40 + " per " + getWorkingParameter() + " weeks worked.");
    }
    public void display(){
        System.out.printf("Worker: %s, age: %s, position: %s.\n", super.getName(), super.getAge(), getPosition());
    }
}
