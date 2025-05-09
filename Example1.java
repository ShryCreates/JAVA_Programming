import java.lang.*;
class calculator{
    double i;
    double x=Math.sqrt(i);
}
class Example1 {
    public static void main(String args[]){
        calculator c=new calculator();
        c.i=20;
        System.out.println("Square root of "+c.i+" is "+c.x);
    }
}
