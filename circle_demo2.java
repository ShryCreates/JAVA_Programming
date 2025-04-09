//multiple objects
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
class circle_demo2 {
public static void main(String args[]){
    circle c1=new circle();
    circle c2=new circle();
    c1.x=3.0;
    c1.y=4.0;
    c1.r=5.0;
    c2.x=-4.0;
    c2.y=-8.0;
    c2.r=10.0;
    System.out.println("Circumference 1:"+c1.circumference());    
    System.out.println("Circumference 2:"+c2.circumference());
    System.out.println("Area 1:"+c1.area());
    System.out.println("Area 2:"+c2.area());
    }  
}
