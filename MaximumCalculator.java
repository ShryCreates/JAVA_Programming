//finding the max no. between two
import java.util.Scanner;
public class MaximumCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two no.:");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
