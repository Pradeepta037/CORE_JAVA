import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numeber: ");
        double n = sc.nextDouble();
        if(n>0){
            double s = Math.sqrt(n);
            if(s*s == n){
                System.out.println(s + " is perfect square.");
            }else{
                System.out.println(s + " is not perfect square.");
            }
        }
        sc.close();
    }
}
