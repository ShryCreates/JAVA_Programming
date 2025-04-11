//constructor using this keyword
class circle1{
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
    void setcircle1(double a,double b,double c){
        x=a;
        y=b;
        r=c;
    }
}
class circle2{
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
    circle2(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
}
class circle_demo5 {
    public static void main(String[] args) {
        circle1 c1=new circle1();
        c1.setcircle1(5.0, 6.0, 8.0);
        circle2 c2=new circle2(3.0,4.0,5.0);
        System.out.println("Curcumference 1:"+c1.circumference());
        System.out.println("Area 1:"+c1.area());
        System.out.println("Circumference 2:"+c2.circumference());
        System.out.println("Area 2:"+c2.area());
    }
}
