//methods with parameters
class circle{
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
    //method
    void setcircle(double a,double b,double c){
        x=a;
        y=b;
        r=c;
    }
}
class circle_demo3 {
    public static void main(String[] args) {
        circle c=new circle();
        c.setcircle(3.0,4.0,5.0);
        System.out.println("Circumference:"+c.circumference());
        System.out.println("Area:"+c.area());
    }
}
