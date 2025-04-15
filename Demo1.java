//a program that uses simple class and naive initialization of data.
class Point{
    int x;
    int y;
}
class Demo1 {
    public static void main(String args[]) {
        Point mypoint=new Point();
        mypoint.x=10;
        mypoint.y=20;
        System.out.println("x="+mypoint.x);
        System.out.println("y="+mypoint.y);
    }
}
