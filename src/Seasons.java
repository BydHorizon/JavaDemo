import java.util.Scanner;
public class Seasons{
    public static void main(String[] args){
        //利用if 判断四季 3.4.5春天 6.7.8夏天 9.10.11秋天 12.1.2春天
        //输入 月份
        //输出 季节
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = input.nextInt();
        if (month >= 3 && month < 6){
            System.out.println("春天");
        }
        else if(month >= 6 && month < 9){
            System.out.println("夏天");
        }
        else if(month >= 9 && month < 12){
            System.out.println("秋天");
        }
        else if(month==12 ||month==1 ||month==2 ){
            System.out.println("冬天");
        }
        else {
            System.out.println("您输入的有误");
        }
    }
}