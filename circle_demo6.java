//constructor overloading
class circle{
    double x,y;
    double r;
    circle(double x,double y,double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    circle(double r) {
        x=0;
        y=0;
        this.r=r;
    }
    circle(circle c){
        x=c.x;
        y=c.y;
        r=c.r;
    }
    circle(){
        x=0.0;
        y=0.0;
        r=1.0;
    }
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r; 
    }
}
class circle_demo6 {
    public static void main(String[] args) {
        circle c1=new circle(3.0,4.0,5.0);
        circle c2=new circle(5.0);
        circle c3=new circle(c1);
        circle c4=new circle();
        System.out.println("Circumference 1:"+c1.circumference());
        System.out.println("Circumference 2:"+c2.circumference());
        System.out.println("Circumference 3:"+c3.circumference());
        System.out.println("Circumference 4:"+c4.circumference());
        System.out.println("Area 1:"+c1.area());
        System.out.println("Area 2:"+c2.area());
        System.out.println("Area 3:"+c3.area());
        System.out.println("Area 4:"+c4.area());
    }
}
