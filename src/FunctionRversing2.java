public class FunctionRversing2 {
             //设计一个方法  用来交换一个数组头尾互换
     public void fun(int[]a){
         for(int i = 0 ; i<a.length/2;i++){
             int temp =a [i];
             a[i] = a[a.length-1-i];
             a[a.length-1-i] =temp;
         }
     }



    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        FunctionRversing2 m = new FunctionRversing2();
        m.fun(a);
        for (int x: a){
            System.out.println(x);
        }
    }
}
