public class MethodLearn {
    public static void main(String[] args) {
        int n = 5;
        fun3(n);
        System.out.println(fun4(4, 7));
    }

//声明一个函数，计算1-100的和并输出
//无返回值，无参数
    public static void fun1(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
           sum += i;
        }
        System.out.println(sum);
    }

//有返回值，无参数
    public static int fun2(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

//无返回值。有参数
    public static void fun3(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

//声明一个函数，计算n-m的和并返回计算结果，n、m在调用方法时传入
    public static int fun4(int n, int m){
        int sum = 0;
        while(n <= m){
            sum += n;
            n++;
        }
        return sum;
    }
}