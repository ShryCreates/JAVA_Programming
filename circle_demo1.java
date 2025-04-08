//adding methods and declaring object
class circle {
    double x,y; //coordinates of center
    double r; //radius
    // method that returns circumference
    double circumference(){
        return 2*3.14*r;
    }
    // method that returns area
    double area(){
        return 3.14*r*r;
    }
}
// main class
class circle_demo1{
    public static void main(String args[]) {
        circle c=new circle();
        c.x=0.0;
        c.y=0.0;
        c.r=5.0;
        System.out.println("Circumference:"+c.circumference());
        System.out.println("Area:"+c.area());
    }
}
