public class Split{
    public static void main(String args[]){
      //给定一个数组a{1,2,3,4,9,5,6}按数组中的最大位置拆分成两个数组
        int[] a = {1,2,3,4,9,5,6};
        //找最大元素 位置
        int index=0;
        int max=0;
       for(int i=0;i<a.length;i++){
           if(a[i]>max){
               max = a[i];
               index =i;
           }
       }
       int[] b= new int[index-1];
       int[] c= new int[a.length-index-1];
       for (int i=0;i<b.length;i++){
           b[i]=a[i];
       }
       int  m=1;
       for(int i = 0 ;i<c.length;i++){

           c[i]=a[index+m++];
       }
       for (int i:b){
           System.out.println(i);
       }
        for (int i:c){
            System.out.println(i);
        }
    }

}