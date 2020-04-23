import java.util.Scanner;
public class ScoreJudge{
    public static void main(String args[]){
        System.out.println("请输入本次考试成绩：");
        Scanner age=new Scanner(System.in);
        int x1=age.nextInt();
        if(x1>60&&x1<80){
            System.out.println("本次考试及格。");
        }else if(x1>80&&x1<90){
            System.out.println("本次考试成绩良好。");
        }else if (x1>90&&x1<100){
            System.out.println("本次考试成绩优秀。");
        }else if(x1>100&&x1<0){
            System.out.println("输入成绩无效。");
        }else{
            System.out.println("本次考试成绩不合格。");
        }
    }
}