public class MultiplicationTable{
    public static void main(String[] args){
        //九九乘法表
          //1*1=1
          //2*1=2 2*2=4
          //3*1=3 3*2=6 3*3=9
        for(int i=1;i<=9;i++){   //外层循环控制行数
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" "+"\t");   //制表符
            }
            System.out.println();
        }
    }
}