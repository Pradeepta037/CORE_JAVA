public class S6 {
    public static void main(String []a){
        String s1= "Allis";
        String s2= s1;
        s1 = s1.concat("Well");
        if(s1==s2){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
        StringBuilder sb1 = new StringBuilder("Allis");
        StringBuilder sb2 = sb1;
        sb1 = sb1.append("Well");
        if(sb1==sb2){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
    }
}
