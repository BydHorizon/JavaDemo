import java.util.Scanner;
public class Plan{
    public static void main(String[] args){
        //利用Scanner 为小茗同学制定一个学习计划
        //1.3.5  学英文
        //2.4.6  学编程
        //7      玩
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个日期");
        int day = input.nextInt();
        switch (day){
            case 1:
            case 3:
            case 5:
                      System.out.println("学英文");break;
            case 2:
            case 4:
            case 6:
                      System.out.println("学习编程");break;
            case 7:
                      System.out.println("又学编程又学英语");break;
            default:
                      System.out.println("输入日期错误");

        }
    }
}