import java.util.Scanner;

public class Login2{
    public static void main(String[] args){
        //用二维数组做登录认证
        String[][] dataBase= {{"郑中拓","111"},{"阿里巴巴","666"},{"腾讯","888"}};
        System.out.println("登录验证");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = input.nextLine();
        Scanner write = new Scanner(System.in);
        System.out.println("请输入密码");
        String cipher = write.nextLine();
        boolean b = false;
        for(int i=0;i<dataBase.length;i++){
            String[] a=dataBase[i];
            for(int j=0;j<2;j++){
            if(a[j].equals(name)){
                if (a[j+1].equals(cipher)){
                System.out.println("登录成功");
                b=true;}
            }
            }
        }
        if (b==false){
            System.out.println("用户或密码错误");
        }
    }
}