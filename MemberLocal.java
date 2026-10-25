public class MemberLocal {
    //声明在类内部，方法体外部的变量叫成员变量
    int a = 10;
    public static void main(String[] args) {
        //声明在类内部的变量叫做局部变量
        int b = 5;
        System.out.println(b);
        //System.out.println(a);
    }
}
