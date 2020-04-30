public class People{
    double height;
    int age;
    int sex;

    void cry(){
        System.out.println("天津");
    }
    void laugh(){
        System.out.println("甘肃");
    }
    void printBaseMes(){
        System.out.println("我的身高是"+height+"cm");
        System.out.println("我的年龄是"+age+"岁");
        if(this.sex==0)
        System.out.println("我是男性！");
        else
        System.out.println("我是女性！");
    }
}