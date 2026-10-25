public class IncrementOperator{
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;//前置自增运算符，a先自增加1，然后再将a的值赋值给变量b
        System.out.println(a);
        System.out.println(b);

        int m = 10;
        int n = m++;//后置自增运算符
        System.out.println(m);
        System.out.println(n);
    }
}