public class S2 {
    public static void main(String []a){
        String s1= "ball";
        String s2= "bat";
        int res = s1.compareTo(s2);
        System.out.println(res);
        if(res==0){
            System.out.println("Same");
        }
        else if(res>0){
            System.out.println("S1 is Greater");
        }
        else if(res<0){
            System.out.println("S1 is Smaller");
        }
    }
}
