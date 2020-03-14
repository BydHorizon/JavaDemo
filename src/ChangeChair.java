import java.util.Scanner;
public class ChangeChair{
   public static void main(String[] args){
       //模拟班级同学每周换座位
       //创建一个二维数组表示每一列同学
       int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};   //0->3 3->2 2->1 1->0
       //设计一周交换一次 第N周位置
       Scanner input = new Scanner(System.in);
       System.out.println("请输入一个数");
       int week = input.nextInt();
       for(int i=0;i<week%4;i++){  //求模的方法固定写
           int[] x = array [0];
           array[0]=array[1];
           array[1]=array[2];
           array[2]=array[3];
           array[3]= x;

       }
       for (int[] m:array){
           for (int y:m){
               System.out.println(y);
           }
       }
   }
}