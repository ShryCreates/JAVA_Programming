//multiple classes
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
}
class box{
    double w;//width
    double h;//height
    double d;//depth
    double area(){  
        double a;
        a=(w*h+w*d+h*d)*3;
        return a;
    }
    double volume(){
        double v;
        v=w*h*d;
        return v;
    }
}
class multiclass {
    public static void main(String[] args) {
        circle c=new circle();
        box b=new box();
        c.x=3.0;
        c.y=4.0;
        c.r=5.0;
        b.w=1.0;
        b.h=4.0;
        b.d=5.0;
        System.out.println("Circumference of circle:"+c.circumference());
        System.out.println("Area of circle:"+c.area());
        System.out.println("Area of box:"+b.area());
        System.out.println("Volume of box:"+b.volume());
    }
}
