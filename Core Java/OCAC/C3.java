public class C3 {
    public static void main(String[] args) {
        int i=0;
        while(i<3){
            System.out.println("Before"+i);
            if(i==2)
                continue;
            System.out.println("Afetr"+i);
            i++;
        }
    }
}
