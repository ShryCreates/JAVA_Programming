// odd or even
import java.util.Scanner;
public class W01_p1 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        // check if the no. is odd or even
        if(number%2==0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
        in.close();
    }
}
