public class S4 {
    public static void main(String []a){
        String s1= "Allis";
        String s2= s1;
        s1 = s1.concat("Well");
        System.out.println(s1);
        System.out.println(s1==s2);
    }
}
