public class MaxAndMin{
    public static void main(String args[]){
        int [] data={313,89,123,323,313,15,90,56,39};
        int max=data[0];
        int min=data[0];
        for(int i=0;i<data.length;i++){
            if(min>data[i]){
                min=data[i];
            }
            if(max<data[i]){
                max=data[i];
            }
        }
        System.out.println("这组数据中的最大值为："+max+" 这组数据中的最小值为："+min);
    }
}