import java.util.Scanner;
public class SwitchLearn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数字1-4：");
        int num = s.nextInt();
        switch(num){
            case 1:
                System.out.println("你选择了1");
                break;
            case 2:
                System.out.println("你选择了2");
                break;
            case 3:
                System.out.println("你选择了3");
                break;
            case 4:
                System.out.println("你选择了4");
                break;
            default:
                System.out.println("选择无效！");
                break;
        }
    }
}
