class F3{
    public static void main(String[] args){
        System.out.println("Main Begins");
        fun1();
        System.out.println("Main End");
    }
    public static void fun1(){
        System.out.println("fun1() begin");
        fun2();
        System.out.println("fun1() end");
    }
    public static void fun2(){
        System.out.println("Inside fun2()");
    }
}