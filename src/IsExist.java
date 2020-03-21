import java.util.Scanner;

public class IsExist{
          public void find(int[]a,int x){
              boolean b= false;
              for (int i =0;i<a.length;i++){
                  if(x==a[i]){
                      b=true;
              }
          }
              if(b==true){
                  System.out.println("查找成功");}
              else {
                  System.out.println("查找失败");
              }

          }
    // 用来找寻给定的元素是否在数组内存在（Scanner 输入一个）
    public static void main(String[] args){
         int[] a = {1,2,3,4,5,6,7,8,};
         IsExist m = new IsExist();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入查找的元素");
        int find1= input.nextInt();
        m.find(a,find1);
    }
}
