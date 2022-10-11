import java.util.Scanner;

public class LineCompute {
    public static Integer x1 = 15;
    public static Integer y1 = 16;
    public static Integer x2 = 17;
    public static Integer y2 = 18;

    public static void main(String[]args) {
        System.out.println("Welcome to Line Comparison Computation");
        System.out.println("Value of x1=" +x1 + " Value of y1=" +y1 );
        System.out.println("Value of x2=" +x2 + " Value of y2=" +y2 );
        System.out.println("Choose Option 1 for Length of line ");
        System.out.println("Choose Option 2 for Equality of line ");
        System.out.println("Choose Option 3 for Comparison of line ");
        System.out.println("Enter an Option: ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            lengthLine();
        }
        else if (opt ==2) {
            lineEquality();
        }
        else if(opt ==3) {
            compareLine();
        }
        else {
            System.out.println("Invalid Option");
        }
    }
    public static void lengthLine() {
        double l = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of line is: " + l);
    }

    public static void compareLine() {
        int compare1 = Integer.compare(x1, y1);
        System.out.println("Comparing x1 and y1 = " + compare1);
        int compare2 = Integer.compare(x2, y2);
        System.out.println("Comparing x2 and y2 = " + compare2);
    }
    public static void lineEquality() {
        boolean len1 = x1 == (y1);
        System.out.println("x1 and y1 are equal? " + len1);
        boolean len2 = x2 == (y2);
        System.out.println("x2 and y2 are equal? " + len2);
    }

}

