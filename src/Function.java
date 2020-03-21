import java.util.Scanner;

public class Function{
    public void fucntion(int[]a,int b){
        int  max =0;
        int  min =a[0];
        for (int i =0;i<a.length;i++) {
             if(b==1&&max<a[i]){
                 max=a[i];
             }
             else if (b==2&&min>a[i]){
                 min=a[i];
                 System.out.println(min);
             }

        }
        if(b==1){
            System.out.println(max);
        }
        else {
            System.out.println(min);
        }


    }

    //设计一个方法  用来找寻数组中的极值（最大值 或 最小值）
    public static void main (String[] args){
        int[] a = {1,2,3,4,5,6};
          Function m = new Function();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入最大值或最小值：1表示最大值 2表示最小值");
        int value =input.nextInt();
          m.fucntion(a,value);
    }
}