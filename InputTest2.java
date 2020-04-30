import java.util.ArrayList;
import java.util.Scanner;

public class InputTest2{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        Scanner in =new Scanner(System.in);
        String line=null;
        while(!"end".equals(line=in.nextLine())){
            list.add(line);
        }
        for(String str:list){
            System.out.println(str);
        }
    }
}