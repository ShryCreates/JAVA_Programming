//defining a class with method
class Point{
    int x,y;
    void setPoint(){
        x=10;
        y=20;
    }
}
class Demo2 {
    public static void main(String[] args) {
        Point p=new Point();
        p.setPoint();
        System.out.println("x="+p.x);
        System.out.println("y="+p.y);
    }
}
