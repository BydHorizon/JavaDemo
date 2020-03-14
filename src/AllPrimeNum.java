public class AllPrimeNum{
    public static void main(String[] args){
        //19.创建一个数组存储2-100之间的素数
        //找素数计数
        int num=0;
        for(int i = 2;i<=100;i++) {
              boolean b=true;                //每次循环都要更新b=true 否则一直循环false
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    b = false;
                }
            }
            if (b==true) {
                num++;
            }
        }
        System.out.println("素数的个数是"+num);
        int[] x =new int[num];
        int m =0;
        for(int i = 2;i<=100;i++) {
            boolean b=true;                //每次循环都要更新b=true 否则一直循环false
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    b = false;
                }
            }
            if (b==true) {
                x[m++]=i;
            }
        }
        for (int y:x){
            System.out.println(y);
        }
    }
}