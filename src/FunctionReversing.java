public class FunctionReversing{
    public  int[][]   fun(int[]a,int[]b){
        int[] temp =a;
        a=b;
        b=temp;
        int result[][]={a,b};
         return result;
    }
    public static void main(String[] args){
        //设计一个方法   用来交换交换两个数组元素a{1,2,3,4}  b{5,6,7,8}
        FunctionReversing ok = new FunctionReversing();
        int[]a={1,2,3,4};
        int[]b={5,6,7,8};
        int[][]x=ok.fun(a,b);
        for (int[]m:x){
            for(int y:m){
                System.out.println(y);
            }
        }
    }
}