import java.util.Scanner;
public class Study{
    //帮我学英文（星期七个单词）
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请让您输入一个数字，我来输出一个对应的英文星期");
        int day= input.nextInt();//nextInt输入数字 nextLine()输入字符串
        if (day==1){
            System.out.println("Monday");
        }
        else if (day == 2){
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("wednesday");
        }
        else if (day == 4){
            System.out.println("thursday");
        }
        else if (day == 5){
            System.out.println("Fridayu");
        }
        else if (day == 6){
            System.out.println("Thursday");
        }
        else if (day == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("没有这么玩的~");
        }
    }
 }