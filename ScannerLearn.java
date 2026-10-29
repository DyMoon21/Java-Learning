import java.util.Scanner;
public class ScannerLearn{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入成绩：");
        double score = s.nextDouble();
        if (score >= 60) {
            System.out.println("恭喜你，及格了");
        }else{
            System.out.println("很遗憾，没有及格");
        }
    }
}