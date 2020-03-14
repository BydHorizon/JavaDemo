import java.util.Scanner;

public class FunctionStar {
    //每一个类不是必须包含主方法
    //主方法不属于任何一个类---主方法属于虚拟机
    public void fun(int a,String b){
        if (b.equals("左")) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(b.equals("右")){                           //先画空格 再画星
            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= a-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args){
        //设计一个方法   用来画三角形 倒三角形(行数不确定 方向也不确定)
        FunctionStar draw =new FunctionStar();
        Scanner input = new Scanner(System.in);
        System.out.println("画几行小星星");
        int num = input.nextInt();
        Scanner write = new Scanner(System.in);
        System.out.println("请输入左或右");
        String direction = write.nextLine();
        draw.fun(num,direction);


}
}
