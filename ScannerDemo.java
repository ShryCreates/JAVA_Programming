//sum of two no. taken by the user
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 1st no.:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd no.:");
        num2=sc.nextInt();
        System.out.println("Sum of no. is "+(num1+num2));
    }
}
