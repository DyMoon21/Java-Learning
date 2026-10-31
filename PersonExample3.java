public class PersonExample3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        fun(a);
        System.out.println(a);
    }
//值传递
    public static void fun(int b) {
        b = 10;
        System.out.println(b);
    }
}
