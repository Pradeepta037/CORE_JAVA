class F2{
    public static void main(String[] args){
        System.out.println("Before call");
        fun();
        fun();
        System.out.println("After call");
    }
    public static void fun(){
        System.out.println("Inside fun()");
    }
}