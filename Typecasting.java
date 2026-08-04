import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // float num = input.nextFloat();
        // System.out.println("The value of num is: " + num);

        // Typecasting from float to int
        // int num1 = (int)(54.65f);
        // System.out.println("The value of num1 is: " + num1);

        // Automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a); // Typecasting int to byte 257 % 256 = 1
        
        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c; // 40 * 50 / 100 = 20
        
        // System.out.println(d);

        // byte b = 50;
        // b = b * 2;
        

        // int num  = 'A'; // Giving the ASCII value of character 'A' to num variable
        // System.out.println(num);

        // System.out.println("你好");

        // System.out.println(3 * 5.8595464136f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println(result);
    }
}
