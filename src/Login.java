import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        //用户的登录认证（用数组当小数据库 存值 用户验证）
        //用户输入 郑中拓 密码 123
        //注册存储时的真实账号密码的地方（数组 充当数据库）
        //需要用户输入用户名和密码
        //比对账号 账号是唯一存在的（主键Primary key约束）
        //登录成（都对了）
        //密码错误
        //用户不存在
        String[] name = {"郑中拓", "阿里巴巴", "腾讯"};
        int[] cipher = {111, 666, 888};
        Scanner input = new Scanner(System.in);
        System.out.println("登录认证");
        System.out.println("请输入用户名");
        String m = input.nextLine();
        System.out.println("请输入登录密码");
        int n = input.nextInt();
        boolean b = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(m)) {
                if (n == cipher[i]) {
                    System.out.println("登录成功");
                    b = true;
                }
            }
        }
        if (b == false) {
            System.out.println("用户名或密码错误");
        }
    }

    }
