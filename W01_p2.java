//volume of a cylinder
import java.util.Scanner;
public class W01_p2 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double radius=in.nextDouble();
        double height=in.nextDouble();
        double volume=Math.PI*radius*radius*height;
        //display the result
        System.out.printf("Volume is: %.2f",volume);
        in.close();
    }
}
