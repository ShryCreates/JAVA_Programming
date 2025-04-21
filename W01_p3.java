//table for any no. till 5 times
import java.util.Scanner;
public class W01_p3 {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        //print the multiplication table
        for(int i=0;i<=5;i++){
            System.out.printf("%dx%d=%d\n",number,i,number*i);
        }
        in.close();
    }
}
