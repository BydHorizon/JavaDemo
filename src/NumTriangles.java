import java.util.Scanner;
public class NumTriangles{
    public static void main(String[] args){
        //数字金字塔                            //空格 数字  数字 空格    换行 循环
        //    1                                   3    1    0    3      1     1
        //   12 1                                 2    2    1    2      1     2
        //  123 21                                1    3    2    1      1     3
        // 1234 321                               0    4    3    0      0     4
        Scanner input =  new Scanner(System.in);
        System.out.println("请输入数字金字塔的层数");
        int num = input.nextInt();
     for (int i=1;i<=num;i++){
         for(int j=1;j<=num-i;j++){  //画左边空格
             System.out.print(" ");
         }
         for(int m=1;m<=i;m++){   //画左边数字
             System.out.print(m);
         }
         for(int n=i-1;n>0;n--){  //画右边的数字
             System.out.print(n);
         }
         for(int j=1;j<=4-i;j++){  //画右边空格
             System.out.print(" ");
         }
         System.out.println();
     }
    }
}