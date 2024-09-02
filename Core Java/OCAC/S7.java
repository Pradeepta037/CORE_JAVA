public class S7 {
    public static void main(String []a){
        String s = "HelloWorld";
        StringBuilder sb = new StringBuilder("dcba");
        sb.reverse();
        System.out.println(sb);
        sb.append("efg");
        System.out.println(sb);
        String s2 = s.substring(4);
        System.out.println(s2);
        sb.setCharAt(1, 'h');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(1, "efg");
        System.out.println(sb);
    }
}
