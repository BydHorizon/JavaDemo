public class FunctionMerge{
    //合并两个数组
    public int[] merge(int[]x,int[]y){
        int[] k=new int[x.length+y.length];
        for (int i=0;i<x.length;i++){
                k[i]=x[i];
        }
        for (int i=0;i<y.length;i++){
                 k[i+x.length]=y[i];
        }
        return   k;
    }
    public static void main(String[] args){
        FunctionMerge Q = new FunctionMerge();
          int[] m = {1,2,3,4};
          int[] n ={7,8,9,10};
          int[]w=Q.merge(m,n);
          for(int x:w){
              System.out.println(x);
          }

    }
}