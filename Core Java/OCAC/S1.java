public class S1 {
    public static void main(String []a){
        String s1= "Maharaja";
        String s2= "maharaja";
        if(s1==s2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String s3= new String("Maharaja");
        if(s1==s3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
