public class Reversing {
    public static void main(String[] args){
        //给定两个数组a{1,2,3,4} b{5,6,7,8}将两个数组中的元素对应位置互换
        //方法一  交换数组对应元素  受长度限制 时间慢
       /* int[] a={1,2,3,4};
        int[] b={5,6,7,8};
        int i;
        for ( i=0; i<4;i++){
            int[] temp= new int[4];
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp [i];
        }
        for (int x:a){
            System.out.println(x);  //输出a 是hashCode码
        }
        for (int y:b){
            System.out.println(y);
        }*/
       //方法二  利用引用传递地址
        int[] a={1,2,3,4};
        int[] b={5,6,7,8};
        int[] temp = a;
        a=b;
        b=temp;
        for (int x:a){
            System.out.println(x);  //输出a 是hashCode码
        }
        for (int y:b){
            System.out.println(y);
        }

    }
}
