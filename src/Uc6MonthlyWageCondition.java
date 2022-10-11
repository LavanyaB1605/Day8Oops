import java.util.Random;
import java.util.Scanner;

public class Uc6MonthlyWageCondition {
    public static void main(String[] args) {
        Random ec = new Random();
        Scanner sc = new Scanner(System.in);
        int empCheck = ec.nextInt(3);
        System.out.printf("Enter No. Of Hours Worked Per Day: ");

        //initializing values
        int day;
        int partTime = 4;
        int fullTime = 8;
        int hour = sc.nextInt();
        int dailySalary = 0;
        int totalSalary = 0;

        if(empCheck == 1) {
            System.out.println("Employee worked part time");
            for(day=1; day<=20; day++);
            if(hour <= 100)
                dailySalary = partTime * hour * day;
            totalSalary = totalSalary + dailySalary;
            System.out.println("Monthly wage of the employee is: " +dailySalary); }

        else if(empCheck == 2) {
            System.out.println("Employee worked full time");
            for(day=1; day<=20; day++);
            if(hour <= 100)
                dailySalary = fullTime * hour * day;
            totalSalary = totalSalary + dailySalary;
            System.out.println("Monthly wage of the employee is: " +dailySalary); }

        else {
            System.out.println("Employee is Absent");
        }
    }
}
