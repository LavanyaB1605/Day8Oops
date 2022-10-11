import java.util.Random;

public class Uc2DailyWage {
    public static void main(String[] args) {
        Random ec = new Random();
        int wage = 20;
        int hour = 8;
        int salary = 0;
        int empCheck = ec.nextInt(2);
        if(empCheck == 1) {
            System.out.println("Employee is present");
            salary = wage * hour;
            System.out.println("Daily wage of the employee is: " +salary); }
        else{
            System.out.printf("Employee is absent");
        }

    }
}
