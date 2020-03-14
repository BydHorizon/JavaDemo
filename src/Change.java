public class Change {
    public static void main(String[] args){
        //交换两个变量位置
        //方法一  利用变量空间
       /* int a = 1 ;
        int b = 2 ;
        int temp ;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b); */
        //方法二 利用两个数字和
        /*int a = 1 ;
        int b = 2 ;
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println(a);
        System.out.println(b);*/
        //方法三 利用异或进行交换
        int a = 1 ;
        int b = 2 ;
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        System.out.println(a);
        System.out.println(b);




    }




}