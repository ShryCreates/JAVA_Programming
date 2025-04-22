//quotient and remainder
import java.util.Scanner;
public class W01_p4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int quotient=x/y;
        int remainder=x%y;
        System.out.println("The quotient is "+quotient);
        System.out.print("The remainder is "+remainder);
        sc.close();
        sc.close();
    }
}
