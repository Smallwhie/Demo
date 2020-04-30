import java.util.Scanner;

public class InputTest1{
    public static void main(String args[]){
        System.out.println("请输入您所需要的数组空间大小：");
        Scanner in= new Scanner(System.in);
        int unt=0;
        unt=in.nextInt();
        String [] shuzu=new String[unt+1];
        if(unt>0){
            System.out.println("请输入您所需要存储打印的字符串：");
            for(int i=0;i<unt+1;i++){
                shuzu[i]=in.nextLine();
            }
            System.out.println("您所存储的字符串为：");
            for(int i=0;i<unt+1;i++){
                System.out.println(shuzu[i]);
            }
        }else
        System.out.println("您所输入的空间大小有误，请重新尝试！");
    }
}