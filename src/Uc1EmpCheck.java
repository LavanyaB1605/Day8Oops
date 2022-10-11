import java.util.Random;

public class Uc1EmpCheck {
    public static void main(String[] args) {

        Random ec = new Random();
        int empCheck = ec.nextInt(2);

        if(empCheck == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");

    }

}
