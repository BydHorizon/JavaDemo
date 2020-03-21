public class FunctionPrime{
       //存储2-100范围内的素数
    public int[] prime(){
        int[] ok = new int[50];
        int index=0;

        for(int i=2;i<=100;i++ ){
            Boolean flag =false;               //标志位每次循环需要更新
            for (int j=2;j<i;j++){              //满足初值就进入循环
                if(i%j==0){
                   flag=true;
                }
                }
            if (flag==false){
                      ok[index++]=i;
                }
            }return ok;
        }


    public static void main(String[] args){
        FunctionPrime fine = new FunctionPrime();
        int[] but = fine.prime();
        ElimateZero haha = new ElimateZero();
       int[] yehu=haha.elimate(but);
        for ( int x:yehu){
             System.out.println(x);
         }
    }
        }