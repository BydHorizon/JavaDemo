import java.lang.Math;
import java.util.Scanner;
public class Dice{
    public static void main(String[] args){
        //利用if实现一个摇骰子的游戏
        //随机摇一个点数 1-6 Math.random()
        //输入 大 小
        //输出 猜对了 猜错了
       double value = Math.random();//随机数是0-1浮点型强制类型转换
        int dice = (int)(value*6+1);
        System.out.println("买大买小 买定离手");
        Scanner input = new Scanner(System.in);  //创建一个Scanner 对象
        String guess = input.nextLine();
        if ((dice > 3 && guess.equals("大") )||( dice <= 3 && guess.equals("小"))){//字符串比较用equals方法
            System.out.println("恭喜你 猜对了");
        }
        else{
            System.out.println("很遗憾 猜错了");

        }

        System.out.println(dice);
    }
}