import java.util.Scanner;
public class IfLearn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = s.nextDouble();
        if (score >= 90) {
            System.out.println("优秀");
        }else if(score >= 70){
            System.out.println("良好");
        }else if(score >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
