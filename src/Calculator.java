import java.util.Scanner;

public class Calculator{
    //设计一个计算器
       public float add( float a , float b ){
            float answer = a+b;
            System.out.println(answer);
        return  answer;
       }
       public float substract( float a , float b ){
           float answer = a-b;
           System.out.println(answer);
        return  answer;
       }
       public float mutiply( float a , float b ){
            float answer = a*b;
            System.out.println(answer);
            return  answer;
       }
      public float divid( float a , float b ){
             float answer = a/b;
             System.out.println(answer);
             return  answer;
       }
       public void calculator (){
           Scanner input = new Scanner(System.in);
           System.out.println("请输入第一个数字");
           float a= input.nextFloat();
          // float a = Float.parseFloat(one);
           while(true){
           Scanner write = new Scanner(System.in);
           System.out.println("请输入计算符号");
           String b = write.nextLine();
           if(b.equals("=")){
               System.out.println("执行完毕");break;
           }
           Scanner cin = new Scanner(System.in);
           System.out.println("请输入第二个数字");
           float c  = cin.nextFloat();
          // float c = Float.parseFloat(two);
           switch (b){
               case "+" :    a=this.add(a,c); break;
               case "-" :    a=this.substract(a,c); break;
               case "*" :    a=this.mutiply(a,c); break;
               case "/" :     a=this.divid(a,c); break;
           }
           }
       }
       public static  void main(String[] args ){
           Calculator initial = new Calculator();
           initial.calculator();
       }
}