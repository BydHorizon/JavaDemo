import java.util.Scanner;
public class PrimeNum{
      public static void main(String[] args) {
          //输入一个数判断是不是质数
          //输出是素数 不是素数
          Scanner input = new Scanner(System.in);
          System.out.println("请输入一个整数");
          int num = input.nextInt();
          boolean b = true;
          for (int i = 2; i < num; i++) {
              if (num % i == 0) {
                  System.out.println();
                  b = false;
                  System.out.println(num + "不是素数");
                  break;
              }
          }
          if (b == true) {
                  System.out.println(num + "是素数");
          }
      }
}


