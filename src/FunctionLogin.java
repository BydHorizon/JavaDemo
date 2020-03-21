import java.util.Scanner;

public class FunctionLogin {
          //二维数组登录系统
         public void   fun(String[][] a,String S, String m){
             for(int i=0;i<a.length;i++){
                 boolean b =false;
                 for(int j=0;j<2;j++){
                     if(S.equals(a[i][j])&&m.equals(a[i][j+1])){
                         b=true;
                     }
                 }   if (b==true){
                     System.out.println("登录成功");break;
                 }
                     else {
                     System.out.println("登录失败 用户名或密码错误");break;
                 }
             }
    }
         public static void main(String[] args){
             String[][] dataBase = {{"HuaWei","666"},{"Alibaba","888"},{"Tecnet","999"}};
             Scanner input = new Scanner(System.in);
             System.out.println("请输入用户名");
             String name = input.nextLine();
             Scanner write = new Scanner (System.in);
             System.out.println("请输入密码");
             String cipher = write.nextLine();
             FunctionLogin one = new FunctionLogin();
             one.fun(dataBase,name,cipher);
         }
}
