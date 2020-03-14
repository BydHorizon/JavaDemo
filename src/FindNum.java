public class FindNum{
    public static void main(String[] args){
      //给定一个数组a{1,2,3,0,0,0,4,5,0,0,6,0,0,7}去掉数组中的0元素（创建一个新的数组 短的非零元素挑出来）
      int[] a ={1,2,3,0,0,0,4,5,0,0,6,0,0,7};
      //找非0元素个数
        int count = 0;
        int n=0;
        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                count++;
            }
        }
        int[] b = new int[count];
        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                b[n++]=a[i];
            }
        }

        for (int x:b){
            System.out.println(x);
        }

    }
}