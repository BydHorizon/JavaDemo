import java.util.Scanner;
public class Score{
    public static void main(String[] args){
        //考试成绩出来了（成绩区间）
        //利用Switch 语句实现一个判断学生成绩的对应区间
        //不及格  60-70及格 70-80中 80-90良 90-100优秀 100 满分 数据有误
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = input.nextInt();
        switch(score/10){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                      System.out.println("悲催了 挂科了");  break;
            case 6:
                      System.out.println("及格万岁");break;
            case 7:
                      System.out.println("考的还行吧");break;
            case 8:
                      System.out.println("考的不错 但不能拿奖学金");break;
            case 9:
                      System.out.println("有奖学金啦  请大家吃饭");break;
            case 10:   if(score == 100)
                       System.out.println("学霸本霸");break;
            default:
                       System.out.println("没你这号人");
        }
    }
}