import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter your Roll No: ");
        // int Rollno = input.nextInt();
        // System.out.println("Your Roll No is " + Rollno);


        // int a = 562_000_000;
        // System.out.println("The value of a is: " + a);


        // System.out.print("Enter your name: ");
        // String Name = input.nextLine();
        // System.out.println("My name is: " + Name);


        // System.out.print("Enter your marks: ");
        // float marks = input.nextFloat();
        // System.out.println("Your marks are: " + marks);


        // System.out.print("Enter your Grade: ");
        // char Grade = input.next().charAt(0);
        // System.out.println("Your Grade is: " + Grade);

        
        // System.out.print("Enter your salary: ");
        // double salary = input.nextDouble();
        // System.out.println("Your salary is: " + salary);


        System.out.print("Enter your eligibility for next class (true/false): ");
        boolean isIPassed = input.nextBoolean();
        System.out.println("Is I passed: " + isIPassed);
    }
}
