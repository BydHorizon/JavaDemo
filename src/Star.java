import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        //画星星                     任务画* 画空格 画*  循环
        //*******                    4      0      3    1 //直接画第一行 没规律
        //*** ***                    3      1      3    2
        //**   **                    2      3      2    3
        //*     *                    1      5      1    4
        //可读性 健壮性 （严谨） 优化（结构 冗余 内存 性能 复用 扩展）
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您想画的行数");
        int num = input.nextInt();
        for (int i = 1; i <=num; i++) {//控制行数
            if (i == 1) {
                System.out.println("*******");
            }
            else  {                                      //i 从2开始进入子循环
                for (int j = 1; j <=num + 1 - i; j++) { //画星星    5-i
                    System.out.print("*");              //print打印 println打印并换行
                }
                for (int m = 1; m <= 2 * i - 3; m++) {  //画空格    2*i-3
                    System.out.print(" ");
                }
                for (int n = 1; n <= num + 1 - i; n++) {
                    System.out.print("*");              //画星星
                }
                    System.out.println();               //画完一行之后再换行
            }
        }
    }
}
