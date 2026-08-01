import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            break;
        }
        scanner.close();
    }
}
