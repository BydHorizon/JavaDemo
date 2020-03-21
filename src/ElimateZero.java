public class ElimateZero{
      //去除数组中的零元素
    public int[] elimate(int[]x){
        int count =0;
        for(int i=0;i<x.length;i++){
            if (x[i]!=0){
                count++;
            }
        }
        int[] k = new int[count];
         int index=0;
        for (int n=0;n<x.length;n++){
             if(x[n]!=0){
                 k[index++]=x[n];
             }

        }
        return k;
    }
     public static void main(String[] args){
         int[] l = {1,2,3,0,0,0,5,6,0,10,0,11};
         ElimateZero ok = new ElimateZero();
         int[] w = ok.elimate(l);
         for (int x:w){
             System.out.println(x);
         }
     }
}