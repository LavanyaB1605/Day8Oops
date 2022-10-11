import java.util.Random;

public class Uc3PartTime {
    public static void main(String[] args) {
        Random ec = new Random();
        int wage = 20;
        int hour;
        int salary = 0;
        int empCheck = ec.nextInt(3);
        if(empCheck == 1) {
            System.out.println("Employee worked part time");
            hour = 4;
            salary = wage * hour;
            System.out.println("Daily wage of the employee is: " +salary); }
        else if(empCheck == 2) {
            System.out.println("Employee worked full time");
            hour = 8;
            salary = wage * hour;
            System.out.println("Daily wage of the employee is: " +salary); }
        else {
            System.out.println("Employee is Absent");
        }
    }

}
