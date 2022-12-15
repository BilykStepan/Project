import Payment.DayPayment;
import Payment.HourPayment;
import Payment.MonthlyPayment;
import Payment.WeekPayment;

public class Main {
    public static void main(String[] args) {
        HourPayment emlp1 = new HourPayment("Bob",36,"driver",120.0,9);
        DayPayment empl2 = new DayPayment("Alex",70,"cleaner",80.0,125);
        WeekPayment empl3 = new WeekPayment("Brian",30,"expeditor",115.0,25);
        MonthlyPayment empl4 = new MonthlyPayment("Sarah",40,"counter",150.0,5);
        emlp1.display();
        System.out.println(emlp1.getSalary());
        empl2.display();
        System.out.println(empl2.getSalary());
        empl3.display();
        System.out.println(empl3.getSalary());
        empl4.display();
        System.out.println(empl4.getSalary());
    }
}
