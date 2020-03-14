public class Merge{
    public static void main(String[] args){
        //16.给定两个数组{1,2,3} b{4,5}合并两个数组（创建一个新的数组5长度）
        int[] a={1,2,3};
        int[] b={4,5};
        int[] c= new int[a.length+b.length];
        for (int i=0;i<c.length;i++){
            if(i<a.length){
            c[i] = a[i];
            }
            else if (i>=a.length)
            c[i]=b[i-a.length];
        }
        for(int x:c){
            System.out.println(x);
        }
    }
}