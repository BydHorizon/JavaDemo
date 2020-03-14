public class Reversing2{
    public static void main(String[] args){
        //给定一个数组a{1,2,3,4,5,6} 将这个数组中的元素头尾对应位置互换
        int[] a={1,2,3,4,5,6};

        for ( int i =0; i<a.length/2;i++){
            int b;
            int d =a.length;
            b=a[i];
            a[i]=a[d-i-1];
            a[d-i-1]=b;
        }
        for (int c:a){
            System.out.println(c);
        }

    }
}