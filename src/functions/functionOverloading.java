package src.functions;

public class functionOverloading {
    public static void main(String[] args) {
        fun("hgj");
        fun(46);
    }
    static void fun(int a){
        System.out.println(a);
    }

      static void fun(String a){
        System.out.println(a);
    }
}
