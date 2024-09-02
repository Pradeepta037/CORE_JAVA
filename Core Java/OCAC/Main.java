import java.util.Scanner;
public class Main {
   public static void main(String args[]){
    //   int height, base, area;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the height of the triangle ::");
      int height = sc.nextInt();
      System.out.println("Enter the base of the triangle ::");
      int base = sc.nextInt();
      double area = 0.5 * (height* base);
      System.out.println("Area of the triangle is ::"+area);
       
   }
}