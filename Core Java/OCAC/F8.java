class Point1{
    int x, y;
}

public class F8{
    public static void main(String[] args){
        Point1 p= new Point1();
        p.x=5;
        p.y=10;
        fun(p);
        System.out.println(p.x+" "+p.y);
    }
    public static void fun(Point1 p){
        p = new Point1();
        p.x=10;
        p.y=10;
    }  
}
